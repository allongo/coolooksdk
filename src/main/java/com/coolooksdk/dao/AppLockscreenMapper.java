package com.coolooksdk.dao;

import com.coolooksdk.model.AppLockscreen;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface AppLockscreenMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_lockscreen
     *
     * @mbg.generated Tue May 08 15:56:10 CST 2018
     */
    @Delete({
        "delete from app_lockscreen",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_lockscreen
     *
     * @mbg.generated Tue May 08 15:56:10 CST 2018
     */
    @Insert({
        "insert into app_lockscreen (id, title, ",
        "img, type, datatime, ",
        "isshow, src, rank, ",
        "versionid, createuid, ",
        "createtime, countryid, ",
        "countrycode, langid, ",
        "channelid, topicsid, ",
        "attr, isscroll, ",
        "sourceid, imgsize, ",
        "isfree, abstracts)",
        "values (#{id,jdbcType=INTEGER}, #{title,jdbcType=VARCHAR}, ",
        "#{img,jdbcType=VARCHAR}, #{type,jdbcType=SMALLINT}, #{datatime,jdbcType=TIMESTAMP}, ",
        "#{isshow,jdbcType=SMALLINT}, #{src,jdbcType=VARCHAR}, #{rank,jdbcType=SMALLINT}, ",
        "#{versionid,jdbcType=INTEGER}, #{createuid,jdbcType=INTEGER}, ",
        "#{createtime,jdbcType=TIMESTAMP}, #{countryid,jdbcType=INTEGER}, ",
        "#{countrycode,jdbcType=VARCHAR}, #{langid,jdbcType=INTEGER}, ",
        "#{channelid,jdbcType=INTEGER}, #{topicsid,jdbcType=INTEGER}, ",
        "#{attr,jdbcType=INTEGER}, #{isscroll,jdbcType=INTEGER}, ",
        "#{sourceid,jdbcType=INTEGER}, #{imgsize,jdbcType=INTEGER}, ",
        "#{isfree,jdbcType=INTEGER}, #{abstracts,jdbcType=LONGVARCHAR})"
    })
    int insert(AppLockscreen record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_lockscreen
     *
     * @mbg.generated Tue May 08 15:56:10 CST 2018
     */
    @Select({
        "select",
        "id, title, img, type, datatime, isshow, src, rank, versionid, createuid, createtime, ",
        "countryid, countrycode, langid, channelid, topicsid, attr, isscroll, sourceid, ",
        "imgsize, isfree, abstracts",
        "from app_lockscreen",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="img", property="img", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.SMALLINT),
        @Result(column="datatime", property="datatime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="isshow", property="isshow", jdbcType=JdbcType.SMALLINT),
        @Result(column="src", property="src", jdbcType=JdbcType.VARCHAR),
        @Result(column="rank", property="rank", jdbcType=JdbcType.SMALLINT),
        @Result(column="versionid", property="versionid", jdbcType=JdbcType.INTEGER),
        @Result(column="createuid", property="createuid", jdbcType=JdbcType.INTEGER),
        @Result(column="createtime", property="createtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="countryid", property="countryid", jdbcType=JdbcType.INTEGER),
        @Result(column="countrycode", property="countrycode", jdbcType=JdbcType.VARCHAR),
        @Result(column="langid", property="langid", jdbcType=JdbcType.INTEGER),
        @Result(column="channelid", property="channelid", jdbcType=JdbcType.INTEGER),
        @Result(column="topicsid", property="topicsid", jdbcType=JdbcType.INTEGER),
        @Result(column="attr", property="attr", jdbcType=JdbcType.INTEGER),
        @Result(column="isscroll", property="isscroll", jdbcType=JdbcType.INTEGER),
        @Result(column="sourceid", property="sourceid", jdbcType=JdbcType.INTEGER),
        @Result(column="imgsize", property="imgsize", jdbcType=JdbcType.INTEGER),
        @Result(column="isfree", property="isfree", jdbcType=JdbcType.INTEGER),
        @Result(column="abstracts", property="abstracts", jdbcType=JdbcType.LONGVARCHAR)
    })
    AppLockscreen selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_lockscreen
     *
     * @mbg.generated Tue May 08 15:56:10 CST 2018
     */
    @Select({
        "select",
        "id, title, img, type, datatime, isshow, src, rank, versionid, createuid, createtime, ",
        "countryid, countrycode, langid, channelid, topicsid, attr, isscroll, sourceid, ",
        "imgsize, isfree, abstracts",
        "from app_lockscreen"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="img", property="img", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.SMALLINT),
        @Result(column="datatime", property="datatime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="isshow", property="isshow", jdbcType=JdbcType.SMALLINT),
        @Result(column="src", property="src", jdbcType=JdbcType.VARCHAR),
        @Result(column="rank", property="rank", jdbcType=JdbcType.SMALLINT),
        @Result(column="versionid", property="versionid", jdbcType=JdbcType.INTEGER),
        @Result(column="createuid", property="createuid", jdbcType=JdbcType.INTEGER),
        @Result(column="createtime", property="createtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="countryid", property="countryid", jdbcType=JdbcType.INTEGER),
        @Result(column="countrycode", property="countrycode", jdbcType=JdbcType.VARCHAR),
        @Result(column="langid", property="langid", jdbcType=JdbcType.INTEGER),
        @Result(column="channelid", property="channelid", jdbcType=JdbcType.INTEGER),
        @Result(column="topicsid", property="topicsid", jdbcType=JdbcType.INTEGER),
        @Result(column="attr", property="attr", jdbcType=JdbcType.INTEGER),
        @Result(column="isscroll", property="isscroll", jdbcType=JdbcType.INTEGER),
        @Result(column="sourceid", property="sourceid", jdbcType=JdbcType.INTEGER),
        @Result(column="imgsize", property="imgsize", jdbcType=JdbcType.INTEGER),
        @Result(column="isfree", property="isfree", jdbcType=JdbcType.INTEGER),
        @Result(column="abstracts", property="abstracts", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<AppLockscreen> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_lockscreen
     *
     * @mbg.generated Tue May 08 15:56:10 CST 2018
     */
    @Update({
        "update app_lockscreen",
        "set title = #{title,jdbcType=VARCHAR},",
          "img = #{img,jdbcType=VARCHAR},",
          "type = #{type,jdbcType=SMALLINT},",
          "datatime = #{datatime,jdbcType=TIMESTAMP},",
          "isshow = #{isshow,jdbcType=SMALLINT},",
          "src = #{src,jdbcType=VARCHAR},",
          "rank = #{rank,jdbcType=SMALLINT},",
          "versionid = #{versionid,jdbcType=INTEGER},",
          "createuid = #{createuid,jdbcType=INTEGER},",
          "createtime = #{createtime,jdbcType=TIMESTAMP},",
          "countryid = #{countryid,jdbcType=INTEGER},",
          "countrycode = #{countrycode,jdbcType=VARCHAR},",
          "langid = #{langid,jdbcType=INTEGER},",
          "channelid = #{channelid,jdbcType=INTEGER},",
          "topicsid = #{topicsid,jdbcType=INTEGER},",
          "attr = #{attr,jdbcType=INTEGER},",
          "isscroll = #{isscroll,jdbcType=INTEGER},",
          "sourceid = #{sourceid,jdbcType=INTEGER},",
          "imgsize = #{imgsize,jdbcType=INTEGER},",
          "isfree = #{isfree,jdbcType=INTEGER},",
          "abstracts = #{abstracts,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(AppLockscreen record);
}