package com.aku.controller;

import com.aku.dao.UserDao;
import com.aku.dbtools.page;
import com.aku.pojo.Users;
import com.aku.service.UserService;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/updata")
public class UserUpdataController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        UserFindAllController userFindAllController=new UserFindAllController();
        int id=Integer.valueOf(req.getParameter("id"));
        String name=req.getParameter("usename");
        String gender=req.getParameter("usegender");
        String email=req.getParameter("usemail");
        Users users=new Users(id,name,gender,email);
        page pg=new page();
        UserDao userDao=pg.mybatis();
        int res=userDao.update(users);
       //int res=userService.updata(users);
        //req.getRequestDispatcher("/userlist").forward(req,resp);
        userFindAllController.doGet(req, resp);


    }
}
