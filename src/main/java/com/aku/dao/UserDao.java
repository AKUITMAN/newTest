package com.aku.dao;

import com.aku.pojo.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    List<Users> FindAll();
    Users FindOne(@Param("uid")Integer id);
    int delete(@Param("uid")Integer id);
    int update(Users users);
    int insertUserGetId(Users users);
}
