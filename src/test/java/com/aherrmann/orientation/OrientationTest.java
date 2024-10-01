package com.aherrmann.orientation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class OrientationTest {

    @Test
    void tourner_devrait_retourner_EST_en_donnant_le_nombre_1() {
        //GIVEN
        int nombre = 1;

        //WHEN
        String resultat = Orientation.tourner(nombre);

        //THEN
        assertThat(resultat).isEqualTo("EST");
    }
}