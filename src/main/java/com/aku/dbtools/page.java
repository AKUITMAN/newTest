package com.aku.dbtools;

import com.aku.dao.UserDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class page {
    public UserDao mybatis() throws IOException {
        String resource = "mybatis_config.xml";
        //读取mybatis的配置信息
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //使用配置信息创建出sqlSession工程
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //使用工厂来去打开一个连接
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //使用sqlSession对象加载你要执行的接口
        UserDao userdao = sqlSession.getMapper(UserDao.class);
        return userdao;
    }
}
