<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Jeu du nombre</title>
    </head>
    <body>
        <h1>Jeu du nombre</h1>
        
        <form action="nombre" method="POST">
            
            Prenom:<input type="text" name="prenom"><br/>
            Nom:<input type="text" name="nom"><br/>
            <input type="submit" value="Envoyer">
        </form>
        
        
        <p> Nombre joué: ${ nombreJoueur } </p>
        <p> Résultat : ${resultat} </p>
         <p>Nombre de tentatives restantes:  ${partie.getNombreTentativesRestantes()} </p>
         <p>Nombre à deviner:  ${partie.getNombreADeviner()} </p>
    </body>
</html>
