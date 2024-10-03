package com.aherrmann.conversionChiffresRomains;

import java.util.List;

public class ArabicRomanNumerals {
    public static String convert(Integer nombre) {
        String resultat = "";
        int index = 0;
        List<Integer> decompositionNb = List.of(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1);

        if (nombre != null) {
            while (nombre != 0) {
                while (nombre >= decompositionNb.get(index)) {
                    resultat += switch (decompositionNb.get(index)) {
                        case 1 -> "I";
                        case 4 -> "IV";
                        case 5 -> "V";
                        case 9 -> "IX";
                        case 10 -> "X";
                        case 40 -> "XL";
                        case 50 -> "L";
                        case 90 -> "XC";
                        case 100 -> "C";
                        case 400 -> "CD";
                        case 500 -> "D";
                        case 900 -> "CM";
                        case 1000 -> "M";
                        default -> resultat;
                    };
                    nombre -= decompositionNb.get(index);
                }
                index ++;
            }
        }
        return resultat;
    }
}
