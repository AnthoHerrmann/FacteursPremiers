package com.aherrmann.conversionChiffresRomains;

public class ArabicRomanNumerals {
    public static String convert(Integer nombre) {
        String resultat = "";

        if (nombre != null) {
            resultat = switch (nombre) {
                case 1 -> "I";
                case 2 -> "II";
                case 3 -> "III";
                case 5 -> "V";
                case 10 -> "X";
                case 50 -> "L";
                case 100 -> "C";
                case 500 -> "D";
                case 1000 -> "M";
                default -> resultat;
            };
        }

        return resultat;
    }
}
