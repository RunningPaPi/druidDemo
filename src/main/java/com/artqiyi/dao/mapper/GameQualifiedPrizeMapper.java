package com.artqiyi.dao.mapper;

import com.artqiyi.dao.model.GameQualifiedPrize;
import com.artqiyi.dao.model.GameQualifiedPrizeExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface GameQualifiedPrizeMapper {
    @SelectProvider(type=GameQualifiedPrizeSqlProvider.class, method="countByExample")
    int countByExample(GameQualifiedPrizeExample example);

    @DeleteProvider(type=GameQualifiedPrizeSqlProvider.class, method="deleteByExample")
    int deleteByExample(GameQualifiedPrizeExample example);

    @Delete({
        "delete from game_qualified_prize",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into game_qualified_prize (prize_name, prize_type, ",
        "prize_num, user_id, ",
        "create_time, update_time)",
        "values (#{prizeName,jdbcType=VARCHAR}, #{prizeType,jdbcType=VARCHAR}, ",
        "#{prizeNum,jdbcType=INTEGER}, #{userId,jdbcType=BIGINT}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updateTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(GameQualifiedPrize record);

    @InsertProvider(type=GameQualifiedPrizeSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(GameQualifiedPrize record);

    @SelectProvider(type=GameQualifiedPrizeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="prize_name", property="prizeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="prize_type", property="prizeType", jdbcType=JdbcType.VARCHAR),
        @Result(column="prize_num", property="prizeNum", jdbcType=JdbcType.INTEGER),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<GameQualifiedPrize> selectByExample(GameQualifiedPrizeExample example);

    @Select({
        "select",
        "id, prize_name, prize_type, prize_num, user_id, create_time, update_time",
        "from game_qualified_prize",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="prize_name", property="prizeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="prize_type", property="prizeType", jdbcType=JdbcType.VARCHAR),
        @Result(column="prize_num", property="prizeNum", jdbcType=JdbcType.INTEGER),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    GameQualifiedPrize selectByPrimaryKey(Long id);

    @UpdateProvider(type=GameQualifiedPrizeSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") GameQualifiedPrize record, @Param("example") GameQualifiedPrizeExample example);

    @UpdateProvider(type=GameQualifiedPrizeSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") GameQualifiedPrize record, @Param("example") GameQualifiedPrizeExample example);

    @UpdateProvider(type=GameQualifiedPrizeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(GameQualifiedPrize record);

    @Update({
        "update game_qualified_prize",
        "set prize_name = #{prizeName,jdbcType=VARCHAR},",
          "prize_type = #{prizeType,jdbcType=VARCHAR},",
          "prize_num = #{prizeNum,jdbcType=INTEGER},",
          "user_id = #{userId,jdbcType=BIGINT},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(GameQualifiedPrize record);
}