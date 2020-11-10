package com.aku.controller;

import com.aku.dao.UserDao;
import com.aku.dbtools.page;
import com.aku.service.UserService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete")
public class UserDelectController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserFindAllController userFindAllController=new UserFindAllController();
        page pg=new page();
        UserDao userDao=pg.mybatis();
        int id=Integer.valueOf(req.getParameter("id"));
        int res=userDao.delete(id);
        userFindAllController.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
