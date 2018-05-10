package com.coolooksdk.service.impl;

import com.coolooksdk.dao.AppLockscreenMapper;
import com.coolooksdk.dao.AppLockscreenMapperEX;
import com.coolooksdk.dao.SdkAliveMapper;
import com.coolooksdk.dao.SdkAliveMapperEX;
import com.coolooksdk.model.AppLockscreen;
import com.coolooksdk.model.SdkAlive;
import com.coolooksdk.queryvo.SdkAliveVO;
import com.coolooksdk.service.ApplockService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by mingle on 2018/5/8.
 */
@Service
public class ApplockServiceImpl implements ApplockService {
    @Resource
    AppLockscreenMapperEX appLockscreenMapperEX;
    @Resource
    SdkAliveMapperEX sdkAliveMapperEX;
    @Override
    public PageInfo<AppLockscreen> selectAll(Integer id, Integer page, Integer size ){
        PageHelper.startPage(page, size);
        List<AppLockscreen> ls = appLockscreenMapperEX.getByStatus(id);
        PageInfo<AppLockscreen> pageInfo = new PageInfo<>(ls);
        return pageInfo;
    }
    @Override
    public PageInfo<SdkAlive> selectAll1(Integer page, Integer size ){
        PageHelper.startPage(page, size);
        List<SdkAlive> ls = sdkAliveMapperEX.getByPage();
        PageInfo<SdkAlive> pageInfo = new PageInfo<>(ls);
        return pageInfo;
    }

    @Override
    public PageInfo<SdkAlive> getByParams(SdkAliveVO sdkAliveVO, Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<SdkAlive> ls = sdkAliveMapperEX.getByParams(sdkAliveVO);
        PageInfo<SdkAlive> pageInfo = new PageInfo<>(ls);
        return pageInfo;
    }
}
