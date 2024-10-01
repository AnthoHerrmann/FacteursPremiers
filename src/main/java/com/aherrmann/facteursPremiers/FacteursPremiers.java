package com.aherrmann.facteursPremiers;

import java.util.ArrayList;
import java.util.List;

public class FacteursPremiers {

    public static List<Integer> generer(int nombre) {

        List<Integer> resultat;
        resultat = new ArrayList<Integer>();
        int diviseur = 2;

        if (nombre > 0) {

            while (nombre % diviseur == 0) {
                resultat.add(2);
                nombre = nombre / 2;
            }

            diviseur += 1;
            while (nombre % diviseur == 0) {
                resultat.add(3);
                nombre = nombre / 3;
            }
        }

        return resultat;
    }
}
