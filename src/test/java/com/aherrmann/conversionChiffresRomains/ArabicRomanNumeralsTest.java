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
    void convert_devrait_renvoyer_I_pour_la_valeur_1() {
        //GIVEN
        Integer nombre = 1;

        //WHEN
        String resultat = ArabicRomanNumerals.convert(nombre);

        //THEN
        assertThat(resultat).isEqualTo("I");
    }
}