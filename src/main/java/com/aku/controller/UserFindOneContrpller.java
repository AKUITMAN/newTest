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

@WebServlet("/FindOne")
public class UserFindOneContrpller extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        page pg=new page();
        UserDao userDao=pg.mybatis();
        String ids=req.getParameter("id");
        int id=Integer.valueOf(ids);
        Users users=userDao.FindOne(id);
        req.setAttribute("users",users);
        req.getRequestDispatcher("/updata.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}

