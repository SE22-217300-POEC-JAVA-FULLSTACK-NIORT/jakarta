package com.poe.poe2220718.poe20221004.demo1;

import java.io.IOException;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/nombre")
public class JeuNombreServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {  
        // récupération d'un objet dans la Session
        Partie partie = (Partie)request.getSession().getAttribute("partie");
        
        // Si c'est la premiere fois : la session est vide donc l'objet est null
        if(partie == null){
            partie = new Partie();
        }
        
        // jouer
        // mettre à jour l'état du jeu
        String nombreJoueurString = request.getParameter("nombre");
        int nombreJoueur = Integer.parseInt(nombreJoueurString);
        
        ResultatProposition resultat = partie.jouer(nombreJoueur);
       
        
        // Sauvegarder l'état du jeu dans le session
        request.getSession().setAttribute("partie", partie);

        
        /*     
        switch(resultat) {
            case Gagne:
                response.getWriter().write("<h1>gagné</h1>");
                break;
            case Perdu:
                response.getWriter().write("<h1>Vous avez perdu, nombre de tentatives épuisé</h1>");
                break;
            case TropGrand:
                response.getWriter().write("<h1>trop grand</h1>");
                break;
            case TropPetit:
                response.getWriter().write("<h1>trop petit</h1>");
                break;
        }
        */
   
        request.setAttribute("nombreJoueur", nombreJoueur);
        request.setAttribute("resultat", resultat);
        request.getRequestDispatcher("WEB-INF/hello.jsp").forward(request, response);
  }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    { 
        // récupération d'un objet dans la Session
        Partie partie = (Partie)request.getSession().getAttribute("partie");
        
        // récupération des valeurs des inputs envoyés avec le <form> HTML
        String prenom = request.getParameter("prenom");
        String nom = request.getParameter("nom");
        
        
        
        
//        response.getWriter().write("<h1>Prénom:</h1>"+prenom);
//        response.getWriter().write("<h1>Nom:</h1>"+nom);


        doGet(request, response);
    }
}
