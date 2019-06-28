package com.space.controller;

import com.space.common.util.FileUtil;
import com.space.common.util.StringRandom;
import com.space.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class BaseController {
	
	@Autowired
	protected UserService userService;

	@Autowired
	protected TopicService topicService;

	@Autowired
	protected AnswerService answerService;

	@Autowired
	protected FollowService followService;

	@Autowired
	protected CollectService collectService;

	@Autowired
	protected CommentService commentService;

	@Autowired
	protected RedisService redisService;

	protected String getTokenDto(HttpServletRequest request) throws Exception{
		String accountId = request.getHeader("accountId");
		if(accountId == null || accountId.trim().equals("")){
			throw new Exception("accountId不能为空");
		}
		String userId = userService.getIdByAccountId(accountId);
		if(userId == null || userId.trim().equals("")){
			throw new Exception("用户不存在");
		}
		return userId;
	}

	protected List<Map<String, String>> upload(MultipartFile[] files, String uploadPath, String type) throws Exception{
		if(files == null || files.length == 0){
			return null;
		}
		File upload = new File(uploadPath);
		if(!upload.exists()) {
			upload.mkdirs();
		}
		List<Map<String, String>> res = new ArrayList<Map<String, String>>();
		for (int i = 0; i < files.length; i++) {
			MultipartFile file = files[i];
			if (file.isEmpty()) {
				throw new Exception("上传第" + (i++) + "个文件失败");
			}
			String fileName = file.getOriginalFilename();
			String suffix = fileName.substring(fileName.lastIndexOf("."));
			String basePath;
			if(uploadPath.indexOf(":") < 0){
				basePath = uploadPath;
			}else{
				basePath = uploadPath.substring(uploadPath.indexOf(":") + 1);
			}
			String path = System.currentTimeMillis() + StringRandom.getStringRandom(5) + suffix;
			File dest = new File(uploadPath + path);
			try {
				file.transferTo(dest);
				Map<String, String> map = null;
				if(type.equals("0")){
					map = FileUtil.getImgWidth(dest);
				}
				if(type.equals("1")){
					map = FileUtil.getVideoWidth(dest);
				}
				map.put("path", basePath + path);
				res.add(map);
			} catch (IOException e) {
				throw new Exception("上传第" + (i++) + "个文件失败");
			}
		}
		return res;
	}
}























