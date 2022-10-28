package com.poe.poe2220718.poe20221004.demo1;

import java.io.IOException;
import java.time.LocalDateTime;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/clock")
public class ClockServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
            LocalDateTime hour = LocalDateTime.now();
            response.getWriter().write("<h1>Heure:</h1>"+hour);
    }
}
