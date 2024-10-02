package com.aherrmann.conversionChiffresRomains;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ArabicRomanNumeralsTest {

    @Test
    void convert_devrait_renvoyer_une_chaine_vide_pour_la_valeur_null() {
        //GIVEN
        Integer nombre = null;

        //WHEN
        String resultat = ArabicRomanNumerals.convert(nombre);

        //THEN
        assertThat(resultat).isEqualTo("");
    }

    @Test
    void convert_devrait_renvoyer_une_chaine_vide_pour_la_valeur_0() {
        //GIVEN
        Integer nombre = 0;

        //WHEN
        String resultat = ArabicRomanNumerals.convert(nombre);

        //THEN
        assertThat(resultat).isEqualTo("");
    }

    @Test
    void convert_devrait_renvoyer_I_pour_la_valeur_1() {
        //GIVEN
        Integer nombre = 1;

        //WHEN
        String resultat = ArabicRomanNumerals.convert(nombre);

        //THEN
        assertThat(resultat).isEqualTo("I");
    }

    @Test
    void convert_devrait_renvoyer_II_pour_la_valeur_2() {
        //GIVEN
        Integer nombre = 2;

        //WHEN
        String resultat = ArabicRomanNumerals.convert(nombre);

        //THEN
        assertThat(resultat).isEqualTo("II");
    }

    @Test
    void convert_devrait_renvoyer_III_pour_la_valeur_3() {
        //GIVEN
        Integer nombre = 3;

        //WHEN
        String resultat = ArabicRomanNumerals.convert(nombre);

        //THEN
        assertThat(resultat).isEqualTo("III");
    }

    @Test
    void convert_devrait_renvoyer_V_pour_la_valeur_5() {
        //GIVEN
        Integer nombre = 5;

        //WHEN
        String resultat = ArabicRomanNumerals.convert(nombre);

        //THEN
        assertThat(resultat).isEqualTo("V");
    }

    @Test
    void convert_devrait_renvoyer_X_pour_la_valeur_10() {
        //GIVEN
        Integer nombre = 10;

        //WHEN
        String resultat = ArabicRomanNumerals.convert(nombre);

        //THEN
        assertThat(resultat).isEqualTo("X");
    }

    @Test
    void convert_devrait_renvoyer_L_pour_la_valeur_50() {
        //GIVEN
        Integer nombre = 50;

        //WHEN
        String resultat = ArabicRomanNumerals.convert(nombre);

        //THEN
        assertThat(resultat).isEqualTo("L");
    }

    @Test
    void convert_devrait_renvoyer_C_pour_la_valeur_100() {
        //GIVEN
        Integer nombre = 100;

        //WHEN
        String resultat = ArabicRomanNumerals.convert(nombre);

        //THEN
        assertThat(resultat).isEqualTo("C");
    }
}