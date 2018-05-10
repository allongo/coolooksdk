package com.coolooksdk.service;

import com.coolooksdk.model.AppLockscreen;
import com.coolooksdk.model.SdkAlive;
import com.coolooksdk.queryvo.SdkAliveVO;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Created by mingle on 2018/5/8.
 */
public interface ApplockService {
    PageInfo<AppLockscreen> selectAll(Integer id, Integer page, Integer size);
    PageInfo<SdkAlive> selectAll1(Integer page, Integer size);
    PageInfo<SdkAlive> getByParams(SdkAliveVO sdkAliveVO, Integer page, Integer size);
}
