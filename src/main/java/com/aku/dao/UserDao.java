package com.aku.dao;

import com.aku.pojo.Users;

import java.util.List;

public interface UserDao {
    List<Users> FindAll();
    Users FindOne(int id);
    int updata(Users users);
    int delect(int id);
    int add(Users users);
}
