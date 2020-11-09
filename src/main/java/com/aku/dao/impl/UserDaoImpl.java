package com.aku.dao.impl;

import com.aku.dao.UserDao;
import com.aku.pojo.Users;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    Connection connection=null;
    Statement statement=null;
    ResultSet resultSet=null;
    @Override
    public List<Users> FindAll() {

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

    @Override
    public Users FindOne(int id) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql:///mybatis","root","0909wz");
            statement=connection.createStatement();
            String sql="select * from user where id="+id;
            resultSet=statement.executeQuery(sql);
            while (resultSet.next()){
                Users users=new Users();
                users.setId(resultSet.getInt("id"));
                users.setName(resultSet.getString("name"));
                users.setGender(resultSet.getString("gender"));
                users.setEmail(resultSet.getString("email"));

                return users;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int updata(Users users) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql:///mybatis?characterEncoding=utf8","root","0909wz");
            PreparedStatement preparedStatement=connection.prepareStatement("update user set name=?,gender=?,email=? where id=?");
            preparedStatement.setString(1,users.getName());
            preparedStatement.setString(2,users.getGender());
            preparedStatement.setString(3,users.getEmail());
            preparedStatement.setInt(4,users.getId());
            int res=preparedStatement.executeUpdate();
            return res;
        } catch (Exception e) {
            e.printStackTrace();
        }


        return 0;
    }

    @Override
    public int delect(int id) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql:///mybatis?characterEncoding=utf8","root","0909wz");
            statement=connection.createStatement();
            String sql="delete from user where id="+id;
            int res=statement.executeUpdate(sql);
            return res;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int add(Users users) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql:///mybatis?characterEncoding=utf8","root","0909wz");
            statement=connection.createStatement();
            String sql="insert into user values(0,'"+users.getName()+"','"+users.getGender()+"','"+users.getEmail()+"')";
            int res=statement.executeUpdate(sql);
            return res;
        } catch (Exception e) {
            e.printStackTrace();
        }


        return 0;
    }
}
