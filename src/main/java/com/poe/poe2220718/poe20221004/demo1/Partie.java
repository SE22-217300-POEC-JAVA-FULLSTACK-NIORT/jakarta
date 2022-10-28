package com.poe.poe2220718.poe20221004.demo1;

import java.util.Random;

public class Partie {

    private int nombreADeviner;
    private int nombreTentativesRestantes;
    
    public Partie() {
        nombreADeviner = new Random().nextInt(1, 10);
        nombreTentativesRestantes = 3;
    }

    public int getNombreADeviner() {
        return nombreADeviner;
    }

    public void setNombreADeviner(int nombreADeviner) {
        this.nombreADeviner = nombreADeviner;
    }

    public int getNombreTentativesRestantes() {
        return nombreTentativesRestantes;
    }

    public void setNombreTentativesRestantes(int nombreTentativesRestantes) {
        this.nombreTentativesRestantes = nombreTentativesRestantes;
    }

    public ResultatProposition jouer(int nombreJoueur) {
        if (nombreADeviner == nombreJoueur) {
            nombreADeviner = new Random().nextInt(1, 10);
            nombreTentativesRestantes = 3;
            return ResultatProposition.Gagne;
        } else {
            if (nombreTentativesRestantes == 0) {
                nombreTentativesRestantes = 3;
                nombreADeviner = new Random().nextInt(1, 10);
                return ResultatProposition.Perdu;
            } else {
                nombreTentativesRestantes--;
                if (nombreADeviner < nombreJoueur)
                {
                    return ResultatProposition.TropGrand;
                } else // if (nombreADeviner > nombreJoueur)
                {
                    return ResultatProposition.TropPetit;
                }
            }
        }
    }

}
