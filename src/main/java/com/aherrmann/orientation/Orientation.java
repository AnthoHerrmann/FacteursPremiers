package com.aherrmann.orientation;

public class Orientation {
    public static String tourner(int nombre) {
        String orientation = "NORD";
        int resultat = nombre % 4;

        orientation = switch (resultat) {
            case 0 -> "NORD";
            case 1 -> "EST";
            case 2 -> "SUD";
            case 3 -> "OUEST";
            default -> orientation;
        };

        return orientation;
    }
}
