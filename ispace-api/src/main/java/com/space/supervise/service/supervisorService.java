package com.space.supervise.service;


import com.space.common.dto.star.Cms2AdvAppForm;
import com.space.mybatis.model.Cms2AdvApp;

import java.util.List;


public interface supervisorService {

    /**
     * 首页连接图片
     * @return
     */
    List<Cms2AdvApp> getChanlePic(Cms2AdvAppForm cms2AdvAppForm);
}
