package com.aherrmann.conversionChiffresRomains;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ArabicRomanNumeralsTest {

    @Test
    void convert_devrait_renvoyer_null_pour_la_valeur_0() {
        //GIVEN
        Integer nombre = null;

        //WHEN
        String resultat = ArabicRomanNumerals.convert(nombre);

        //THEN
        assertThat(resultat).isEqualTo("");
    }
}