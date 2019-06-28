package com.space.mybatis.dao;

import com.space.mybatis.model.Cms2AdvApp;
import com.space.common.dto.star.Cms2AdvAppForm;

import java.util.List;

public interface Cms2AdvAppMapper {
    List<Cms2AdvApp> selectByExample(Cms2AdvAppForm cms2AdvAppForm);

    int saveChanlePic(Cms2AdvAppForm cms2AdvAppForm);
}