package com.poe.poe2220718.poe20221004.demo1;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/personne")
public class PersonneServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
    {  
        String prenom = request.getParameter("prenom");
        String nom = request.getParameter("nom");

        response.getWriter().write("<h1>Coucou</h1>");
        response.getWriter().write("<p>Prenom:"+prenom+"</p>");
        response.getWriter().write("<p>Nom:"+nom+"</p>");
    }
}
