package com.aku.dao.impl;

import com.aku.dao.UserDao;
import com.aku.pojo.Users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public List<Users> FindAll() {
        Connection connection=null;
        Statement statement=null;
        ResultSet resultSet=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql:///mybatis","root","0909wz");
            statement=connection.createStatement();
            String sql="select * from user";
            resultSet=statement.executeQuery(sql);
            List<Users> list=new ArrayList<>();
            while (resultSet.next()){
                Users users=new Users();
                users.setId(resultSet.getInt("id"));
                users.setName(resultSet.getString("name"));
                users.setGender(resultSet.getString("gender"));
                users.setEmail(resultSet.getString("email"));
                list.add(users);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
