package com.aku.service.impl;

import com.aku.dao.UserDao;
import com.aku.dao.impl.UserDaoImpl;
import com.aku.pojo.Users;
import com.aku.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserDao userDao=new UserDaoImpl();
    @Override
    public List<Users> FindAll() {
        return userDao.FindAll();
    }
}
