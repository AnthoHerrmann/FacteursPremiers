package com.aherrmann.facteursPremiers;

import java.util.ArrayList;
import java.util.List;

public class FacteursPremiers {
    public static List<Integer> generer(int nombre) {
        int diviseur = 2;
        List<Integer> resultat = new ArrayList<Integer>();

        while(nombre % diviseur == 0) {
            resultat.add(2);
            nombre = nombre / 2;
        }

        diviseur = 3;

        while(nombre % diviseur == 0) {
            resultat.add(3);
            nombre = nombre / 3;
        }

        return resultat;
    }
}
