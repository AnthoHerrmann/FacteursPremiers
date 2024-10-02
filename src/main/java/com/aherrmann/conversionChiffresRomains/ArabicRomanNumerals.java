package com.aherrmann.conversionChiffresRomains;

public class ArabicRomanNumerals {
    public static String convert(Integer nombre) {
        String resultat = "";

        if (nombre != null) {
            if (nombre == 1) {
                resultat = "I";
            }

            if (nombre == 2) {
                resultat = "II";
            }
        }

        return resultat;
    }
}
