package com.coolooksdk.dao;

import com.coolooksdk.model.SdkAlive;
import com.coolooksdk.queryvo.SdkAliveVO;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;

/**
 * Created by mingle on 2018/5/8.
 */
public class SdkAliveMapperSqlProvider {
    public String getByParams(SdkAliveVO sdkAliveVO){
        return new SQL(){
            {
                SELECT("*");
                FROM("sdk_alive");
                if(sdkAliveVO.getStatus() != null && !"".equals(sdkAliveVO.getStatus())){
                    WHERE("status = #{status}");
                }
                ORDER_BY("id desc");
            }
        }.toString();
    }
}
