package com.aherrmann.orientation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class OrientationTest {

    @Test
    void tourner_devrait_retourner_NORD_en_donnant_une_valeur_0() {
        //GIVEN
        Integer nombre = 0;

        //WHEN
        String resultat = Orientation.tourner(nombre);

        //THEN
        assertThat(resultat).isEqualTo("NORD");
    }

    @Test
    void tourner_devrait_retourner_EST_en_donnant_le_nombre_1() {
        //GIVEN
        Integer nombre = 1;

        //WHEN
        String resultat = Orientation.tourner(nombre);

        //THEN
        assertThat(resultat).isEqualTo("EST");
    }

    @Test
    void tourner_devrait_retourner_SUD_en_donnant_le_nombre_2() {
        //GIVEN
        Integer nombre = 2;

        //WHEN
        String resultat = Orientation.tourner(nombre);

        //THEN
        assertThat(resultat).isEqualTo("SUD");
    }

    @Test
    void tourner_devrait_retourner_OUEST_en_donnant_le_nombre_3() {
        //GIVEN
        Integer nombre = 3;

        //WHEN
        String resultat = Orientation.tourner(nombre);

        //THEN
        assertThat(resultat).isEqualTo("OUEST");
    }

    @Test
    void tourner_devrait_retourner_NORD_en_donnant_le_nombre_4() {
        //GIVEN
        Integer nombre = 4;

        //WHEN
        String resultat = Orientation.tourner(nombre);

        //THEN
        assertThat(resultat).isEqualTo("NORD");
    }

    @Test
    void tourner_devrait_retourner_SUD_en_donnant_une_valeur_42() {
        //GIVEN
        Integer nombre = 42;

        //WHEN
        String resultat = Orientation.tourner(nombre);

        //THEN
        assertThat(resultat).isEqualTo("SUD");
    }
}