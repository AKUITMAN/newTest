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

    @Override
    public Users FindOne(int id) {
        return userDao.FindOne(id);
    }

    @Override
    public int updata(Users users) {
        return userDao.updata(users);
    }

    @Override
    public int delect(int id) {
        return userDao.delect(id);
    }

    @Override
    public int add(Users users) {
        return userDao.add(users);
    }
}
