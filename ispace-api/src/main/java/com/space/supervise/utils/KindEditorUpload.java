package com.space.supervise.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.space.common.util.OSSUnit;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.support.StandardMultipartHttpServletRequest;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@RequestMapping("/supervisor/upload")
public class KindEditorUpload {
    private final static Logger logger = LoggerFactory.getLogger(KindEditorUpload.class);
    private static final ObjectMapper objectMapper = new ObjectMapper();
    private  PrintWriter writer = null;

    @Value("${upload-path}")
    private String staticPath;
    @RequestMapping(value = "fileUpload", method = RequestMethod.POST)
    public void fileUpload(MultipartHttpServletRequest request,
                           HttpServletResponse response) throws ServletException, IOException,
            FileUploadException {
        String savePath = staticPath+"data/attachments/";
        // 文件保存目录URL
        String saveUrl = "/data/attachments/";
        // 定义允许上传的文件扩展名
        HashMap<String, String> extMap = new HashMap<String, String>();
        extMap.put("image", "gif,jpg,jpeg,png,bmp");
        extMap.put("flash", "swf,flv");
        extMap.put("media", "swf,flv,mp3,wav,wma,wmv,mid,avi,mpg,asf,rm,rmvb");
        extMap.put("file", "doc,docx,xls,xlsx,ppt,htm,html,txt,zip,rar,gz,bz2");
        // 最大文件大小
        long maxSize = 1000000;
        response.reset();
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        writer = response.getWriter();
        if (!ServletFileUpload.isMultipartContent(request)) {
            writer.println(objectMapper.writeValueAsString(getError("请选择文件。")));
            return;
        }
        // 检查目录
        File uploadDir = new File(savePath);
        if(!uploadDir.exists()){
            uploadDir.mkdir();
        }

        String dirName = request.getParameter("dir");
        if (dirName == null) {
            dirName = "image";
        }
        if (!extMap.containsKey(dirName)) {
            writer.println(objectMapper.writeValueAsString(getError("目录名不正确。")));
            return;
        }
        // 创建文件夹
        savePath += dirName + "/";
        saveUrl += dirName + "/";
        File saveDirFile = new File(savePath);
        if (!saveDirFile.exists()) {
            saveDirFile.mkdirs();
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String ymd = sdf.format(new Date());
        savePath += ymd + "/";
        saveUrl += ymd + "/";
        File dirFile = new File(savePath);
        if (!dirFile.exists()) {
            dirFile.mkdirs();
        }
        List<MultipartFile> files = request.getFiles("imgFile");

        Iterator<MultipartFile> itr = files.iterator();
        while (itr.hasNext()) {
            MultipartFile item = itr.next();
            String fileName = item.getOriginalFilename();
            // 检查文件大小
            if (item.getSize() > maxSize) {
                writer.println(objectMapper.writeValueAsString(getError("上传文件大小超过限制。")));
            }
            // 检查扩展名
            String fileExt = fileName.substring(
                    fileName.lastIndexOf(".") + 1).toLowerCase();
            if (!Arrays.<String> asList(extMap.get(dirName).split(","))
                    .contains(fileExt)) {
                writer.println(objectMapper.writeValueAsString(getError("上传文件扩展名是不允许的扩展名。\n只允许"+ extMap.get(dirName) + "格式。")));
                return;
            }

            SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
            String newFileName = df.format(new Date()) + "_"
                    + new Random().nextInt(1000) + "." + fileExt;
            try {
                File uploadedFile = new File(savePath, newFileName);
                item.transferTo(uploadedFile);

            } catch (Exception e) {
                writer.println(objectMapper.writeValueAsString(getError("上传文件失败。")));
            }

            Map<String, Object> msg = new HashMap<String, Object>();
            msg.put("error", 0);
            msg.put("url", saveUrl+ newFileName);
            writer.println(objectMapper.writeValueAsString(msg));
            return;

        }
        return;
    }

    private Map<String, Object> getError(String message) {
        Map<String, Object> msg = new HashMap<String, Object>();
        msg.put("error", 1);
        msg.put("message", message);
        return msg;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @RequestMapping(value = "/fileManager", method = RequestMethod.GET)
    public void fileManager(HttpServletRequest request,
                            HttpServletResponse response) throws ServletException, IOException {
        ServletContext application = request.getSession().getServletContext();
        ServletOutputStream out = response.getOutputStream();
        // 根目录路径，可以指定绝对路径，比如 /var/www/attached/
        String rootPath = application.getRealPath("/") + "data/attachments/";
        // 根目录URL，可以指定绝对路径，比如 http://www.yoursite.com/attached/
        String rootUrl = request.getContextPath() + "/data/attachments/";
        // 图片扩展名
        String[] fileTypes = new String[] { "gif", "jpg", "jpeg", "png", "bmp" };

        String dirName = request.getParameter("dir");
        if (dirName != null) {
            if (!Arrays.<String> asList(
                    new String[] { "image", "flash", "media", "file" })
                    .contains(dirName)) {
                out.println("Invalid Directory name.");
                return;
            }
            rootPath += dirName + "/";
            rootUrl += dirName + "/";
            File saveDirFile = new File(rootPath);
            if (!saveDirFile.exists()) {
                saveDirFile.mkdirs();
            }
        }
        // 根据path参数，设置各路径和URL
        String path = request.getParameter("path") != null ? request
                .getParameter("path") : "";
        String currentPath = rootPath + path;
        String currentUrl = rootUrl + path;
        String currentDirPath = path;
        String moveupDirPath = "";
        if (!"".equals(path)) {
            String str = currentDirPath.substring(0,
                    currentDirPath.length() - 1);
            moveupDirPath = str.lastIndexOf("/") >= 0 ? str.substring(0,
                    str.lastIndexOf("/") + 1) : "";
        }

        // 排序形式，name or size or type
        String order = request.getParameter("order") != null ? request
                .getParameter("order").toLowerCase() : "name";

        // 不允许使用..移动到上一级目录
        if (path.indexOf("..") >= 0) {
            out.println("Access is not allowed.");
            return;
        }
        // 最后一个字符不是/
        if (!"".equals(path) && !path.endsWith("/")) {
            out.println("Parameter is not valid.");
            return;
        }
        // 目录不存在或不是目录
        File currentPathFile = new File(currentPath);
        if (!currentPathFile.isDirectory()) {
            out.println("Directory does not exist.");
            return;
        }
        // 遍历目录取的文件信息
        List<Hashtable> fileList = new ArrayList<Hashtable>();
        if (currentPathFile.listFiles() != null) {
            for (File file : currentPathFile.listFiles()) {
                Hashtable<String, Object> hash = new Hashtable<String, Object>();
                String fileName = file.getName();
                if (file.isDirectory()) {
                    hash.put("is_dir", true);
                    hash.put("has_file", (file.listFiles() != null));
                    hash.put("filesize", 0L);
                    hash.put("is_photo", false);
                    hash.put("filetype", "");
                } else if (file.isFile()) {
                    String fileExt = fileName.substring(
                            fileName.lastIndexOf(".") + 1).toLowerCase();
                    hash.put("is_dir", false);
                    hash.put("has_file", false);
                    hash.put("filesize", file.length());
                    hash.put("is_photo", Arrays.<String> asList(fileTypes)
                            .contains(fileExt));
                    hash.put("filetype", fileExt);
                }
                hash.put("filename", fileName);
                hash.put("datetime",
                        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(file
                                .lastModified()));
                fileList.add(hash);
            }
        }

        if ("size".equals(order)) {
            Collections.sort(fileList, new SizeComparator());
        } else if ("type".equals(order)) {
            Collections.sort(fileList, new TypeComparator());
        } else {
            Collections.sort(fileList, new NameComparator());
        }
        Map<String, Object> msg = new HashMap<String, Object>();
        msg.put("moveup_dir_path", moveupDirPath);
        msg.put("current_dir_path", currentDirPath);
        msg.put("current_url", currentUrl);
        msg.put("total_count", fileList.size());
        msg.put("file_list", fileList);
        response.setContentType("application/json; charset=UTF-8");
        String msgStr = objectMapper.writeValueAsString(msg);
        out.println(msgStr);
    }

    @SuppressWarnings("rawtypes")
    class NameComparator implements Comparator {
        @Override
        public int compare(Object a, Object b) {
            Hashtable hashA = (Hashtable) a;
            Hashtable hashB = (Hashtable) b;
            if (((Boolean) hashA.get("is_dir"))
                    && !((Boolean) hashB.get("is_dir"))) {
                return -1;
            } else if (!((Boolean) hashA.get("is_dir"))
                    && ((Boolean) hashB.get("is_dir"))) {
                return 1;
            } else {
                return ((String) hashA.get("filename"))
                        .compareTo((String) hashB.get("filename"));
            }
        }
    }

    @SuppressWarnings("rawtypes")
    class SizeComparator implements Comparator {
        @Override
        public int compare(Object a, Object b) {
            Hashtable hashA = (Hashtable) a;
            Hashtable hashB = (Hashtable) b;
            if (((Boolean) hashA.get("is_dir"))
                    && !((Boolean) hashB.get("is_dir"))) {
                return -1;
            } else if (!((Boolean) hashA.get("is_dir"))
                    && ((Boolean) hashB.get("is_dir"))) {
                return 1;
            } else {
                if (((Long) hashA.get("filesize")) > ((Long) hashB
                        .get("filesize"))) {
                    return 1;
                } else if (((Long) hashA.get("filesize")) < ((Long) hashB
                        .get("filesize"))) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }

    @SuppressWarnings("rawtypes")
    class TypeComparator implements Comparator {
        @Override
        public int compare(Object a, Object b) {
            Hashtable hashA = (Hashtable) a;
            Hashtable hashB = (Hashtable) b;
            if (((Boolean) hashA.get("is_dir"))
                    && !((Boolean) hashB.get("is_dir"))) {
                return -1;
            } else if (!((Boolean) hashA.get("is_dir"))
                    && ((Boolean) hashB.get("is_dir"))) {
                return 1;
            } else {
                return ((String) hashA.get("filetype"))
                        .compareTo((String) hashB.get("filetype"));
            }
        }
    }

    /**
     * ajax上传单张照片操作
     * @param request
     * @param response
     * @return
     * @throws FileUploadException
     * @throws IOException
     */
    @ResponseBody
    @RequestMapping(value = "/ajaxupfile")
    public Map<String,String> uploadPartnerImage(HttpServletRequest request, HttpServletResponse response) throws FileUploadException, IOException{
        StandardMultipartHttpServletRequest defaultRequest = (StandardMultipartHttpServletRequest)request;
        MultiValueMap<String, MultipartFile> fileMap =  defaultRequest.getMultiFileMap();
        List<MultipartFile> fileList = fileMap.get("imgFile");
        MultipartFile file = fileList.get(0);
        String dirPath = staticPath+"data/attachments/";
        File dir = new File(dirPath);
        if(!dir.exists()){
            dir.mkdir();
        }
        UUID uuid = UUID.randomUUID();
        String filePath = dirPath+uuid+file.getOriginalFilename();
        File resultFile = inputstreamtofile(file.getInputStream(),filePath);
        Map<String,String> result = new HashMap<String, String>();
        filePath = dirPath+"/"+uuid;
        int i = filePath.indexOf("data");
        String repath = filePath.substring(i);
        result.put("filePath", "/data/attachments/"+uuid+file.getOriginalFilename());
        result.put("realPath", "/data/attachments/"+uuid+file.getOriginalFilename());
        result.put("code","1");
        return result;
    }

    /**
     * ajax上传单张照片写操作
     * @param ins
     * @param fileName
     * @return
     */
    public File inputstreamtofile(InputStream ins, String fileName) {
        File file = new File(fileName);
        try {
            OutputStream os = new FileOutputStream(file);
            int bytesRead = 0;
            byte[] buffer = new byte[8192];
            while ((bytesRead = ins.read(buffer, 0, 8192)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
            os.close();
            ins.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return file;
    }

    @ResponseBody
    @RequestMapping(value = "/ajaxuplode", method = RequestMethod.POST)
    public Map<String, Object> uploadfujian(HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");
        Map<String, Object> result = new HashMap<String, Object>();
        // 调用服务处理文件上传逻辑
        try {
            StandardMultipartHttpServletRequest defaultRequest = (StandardMultipartHttpServletRequest)request;
            MultiValueMap<String, MultipartFile> fileMap =  defaultRequest.getMultiFileMap();
            List<MultipartFile> fileList = fileMap.get("imgFile");
            MultipartFile file = fileList.get(0);

            int length = file.getBytes().length;
            if ((length / 1000) > 5120) {
                response.getWriter().println("{'info':'上传失败，大小超出限制！'}");
                return null;
            }
            if (length > 0) {
                String FileName = file.getOriginalFilename();// 获取原wenjia名称
                InputStream in = file.getInputStream();// 转成流文件
                String returnUrl = OSSUnit.uploadInfo(in, FileName);
                result.put("filePath", returnUrl);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
       return result;
    }
}
