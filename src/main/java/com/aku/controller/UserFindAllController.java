
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
import java.util.List;

@WebServlet("/Findall")
public class UserFindAllController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        page pg=new page();
        UserDao userDao=pg.mybatis();
        List<Users> list=userDao.FindAll();
        req.setAttribute("list",list);
        req.getRequestDispatcher("/userlist.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}

