package com.coolooksdk.dao;

import com.coolooksdk.model.SdkAlive;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface SdkAliveMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_alive
     *
     * @mbg.generated Tue May 08 17:19:41 CST 2018
     */
    @Delete({
        "delete from sdk_alive",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_alive
     *
     * @mbg.generated Tue May 08 17:19:41 CST 2018
     */
    @Insert({
        "insert into sdk_alive (id, packname, ",
        "classname, start_time, ",
        "end_time, status, ",
        "createtime, updatetime, ",
        "createuid, createname)",
        "values (#{id,jdbcType=INTEGER}, #{packname,jdbcType=VARCHAR}, ",
        "#{classname,jdbcType=VARCHAR}, #{startTime,jdbcType=TIMESTAMP}, ",
        "#{endTime,jdbcType=TIMESTAMP}, #{status,jdbcType=INTEGER}, ",
        "#{createtime,jdbcType=TIMESTAMP}, #{updatetime,jdbcType=TIMESTAMP}, ",
        "#{createuid,jdbcType=INTEGER}, #{createname,jdbcType=VARCHAR})"
    })
    int insert(SdkAlive record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_alive
     *
     * @mbg.generated Tue May 08 17:19:41 CST 2018
     */
    @Select({
        "select",
        "id, packname, classname, start_time, end_time, status, createtime, updatetime, ",
        "createuid, createname",
        "from sdk_alive",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="packname", property="packname", jdbcType=JdbcType.VARCHAR),
        @Result(column="classname", property="classname", jdbcType=JdbcType.VARCHAR),
        @Result(column="start_time", property="startTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="end_time", property="endTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="createtime", property="createtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updatetime", property="updatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="createuid", property="createuid", jdbcType=JdbcType.INTEGER),
        @Result(column="createname", property="createname", jdbcType=JdbcType.VARCHAR)
    })
    SdkAlive selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_alive
     *
     * @mbg.generated Tue May 08 17:19:41 CST 2018
     */
    @Select({
        "select",
        "id, packname, classname, start_time, end_time, status, createtime, updatetime, ",
        "createuid, createname",
        "from sdk_alive"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="packname", property="packname", jdbcType=JdbcType.VARCHAR),
        @Result(column="classname", property="classname", jdbcType=JdbcType.VARCHAR),
        @Result(column="start_time", property="startTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="end_time", property="endTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="createtime", property="createtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updatetime", property="updatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="createuid", property="createuid", jdbcType=JdbcType.INTEGER),
        @Result(column="createname", property="createname", jdbcType=JdbcType.VARCHAR)
    })
    List<SdkAlive> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_alive
     *
     * @mbg.generated Tue May 08 17:19:41 CST 2018
     */
    @Update({
        "update sdk_alive",
        "set packname = #{packname,jdbcType=VARCHAR},",
          "classname = #{classname,jdbcType=VARCHAR},",
          "start_time = #{startTime,jdbcType=TIMESTAMP},",
          "end_time = #{endTime,jdbcType=TIMESTAMP},",
          "status = #{status,jdbcType=INTEGER},",
          "createtime = #{createtime,jdbcType=TIMESTAMP},",
          "updatetime = #{updatetime,jdbcType=TIMESTAMP},",
          "createuid = #{createuid,jdbcType=INTEGER},",
          "createname = #{createname,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(SdkAlive record);
}