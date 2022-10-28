<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Jeu du nombre</title>
    </head>
    <body>
        <h1>Jeu du nombre</h1>
        <p> Nombre joué: ${ nombreJoueur } </p>
        <p> Résultat : ${resultat} </p>
         <p>Nombre de tentatives restantes:  ${partie.getNombreTentativesRestantes()} </p>
         <p>Nombre à deviner:  ${partie.getNombreADeviner()} </p>
    </body>
</html>
