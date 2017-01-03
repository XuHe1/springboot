package com.kyx.app.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by kaiitsugyou on 16/12/30.
 */
@WebServlet(urlPatterns = "/lottery/go")
public class MyServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("===========>servlet init......");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("========>MyServlet");
    }
}
