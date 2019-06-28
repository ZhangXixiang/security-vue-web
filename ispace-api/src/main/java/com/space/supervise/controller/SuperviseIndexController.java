package com.space.supervise.controller;

import com.space.common.dto.star.Cms2AdvAppForm;
import com.space.common.util.AjaxResult;
import com.space.common.util.TableDataInfo;
import com.space.mybatis.model.Cms2AdvApp;
import com.space.service.IndexService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("/web")
public class SuperviseIndexController extends BaseController {

    private final static Logger logger = LoggerFactory.getLogger(SuperviseIndexController.class);

    @Autowired
    IndexService indexService;

    /**
     * 后台管理首页
     *
     * @param model
     * @return
     */
    @RequestMapping("/index")
    public String index(Model model) {
        logger.info("后台首页 index  has work");
        return "index";
    }


    @RequestMapping("/bannerPic")
    public String bannerPic(ModelMap map) {
        map.addAttribute("channles", indexService.getChanles());
        return "/bannercanal/canalList";
    }

    @RequestMapping("/canalList")
    @ResponseBody
    public TableDataInfo canalList(Cms2AdvAppForm cms2AdvAppForm) {
        startPage();
        List<Cms2AdvApp> chanlePic = indexService.getChanlePic(cms2AdvAppForm);
        TableDataInfo dataTable = getDataTable(chanlePic);
        return dataTable;
    }

    @RequestMapping("/addBannerPic")
    public String addBannerPic(ModelMap map) {
        return "/bannercanal/addBannerPic";
    }

    @RequestMapping("/doAddBannerPic")
    @ResponseBody
    public AjaxResult doAddBannerPic(Cms2AdvAppForm cms2AdvAppForm) {
        int add = indexService.saveChanlePic(cms2AdvAppForm);
        return toAjax(1);
    }

}
