package com.aku.controller;

import com.aku.service.UserService;
import com.aku.service.impl.UserServiceImpl;

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
        UserService userService=new UserServiceImpl();
        int id=Integer.valueOf(req.getParameter("id"));
        int res=userService.delect(id);
        userFindAllController.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
