package com.coolooksdk.dao;

import com.coolooksdk.model.SdkAlive;
import com.coolooksdk.queryvo.SdkAliveVO;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

/**
 * Created by mingle on 2018/5/8.
 */
public interface SdkAliveMapperEX extends SdkAliveMapper {
    @Select("select * from sdk_alive")
    List<SdkAlive> getByPage();

    @SelectProvider(type = SdkAliveMapperSqlProvider.class, method = "getByParams")
    List<SdkAlive> getByParams(SdkAliveVO sdkAliveVO);
}
