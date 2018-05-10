package com.coolooksdk.dao;

import com.coolooksdk.model.AppLockscreen;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by mingle on 2018/5/8.
 */
public interface AppLockscreenMapperEX extends  AppLockscreenMapper {
    @Select("select * from app_lockscreen where type=#{type}")
    List<AppLockscreen> getByStatus(int type);
}
