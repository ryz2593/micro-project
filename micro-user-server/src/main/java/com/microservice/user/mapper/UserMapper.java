package com.microservice.user.mapper;

import com.microservice.user.domain.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author ryz2593
 * @date 2019/4/15
 * @desc
 */
public interface UserMapper {
    @Select("select id, user_name, user_card, book_id from tb_user where id = #{userId}")
    UserInfo getUser(@Param("userId") Integer userId);
}
