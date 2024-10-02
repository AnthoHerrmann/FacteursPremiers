package com.aherrmann.conversionChiffresRomains;

public class ArabicRomanNumerals {
    public static String convert(Integer nombre) {
        String resultat = "";

        if (nombre != null) {
            resultat = switch (nombre) {
                case 1 -> "I";
                case 2 -> "II";
                case 3 -> "III";
                default -> resultat;
            };
        }

        return resultat;
    }
}
