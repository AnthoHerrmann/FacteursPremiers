package com.aherrmann.facteursPremiers;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

import java.util.List;

class FacteursPremiersTest {

    @Test
    void devrait_renvoyer_la_liste_des_diviseurs_premiers_de_0() {
        //GIVEN
        int nombre = 0;
        List<Integer> expected = List.of();

        //WHEN
        List<Integer> resultat = FacteursPremiers.generer(nombre);

        //THEN
        assertThat(resultat).isEqualTo(expected);
    }

    @Test
    void devrait_renvoyer_la_liste_des_diviseurs_premiers_de_1() {
        //GIVEN
        int nombre = 1;
        List<Integer> expected = List.of();

        //WHEN
        List<Integer> resultat = FacteursPremiers.generer(nombre);

        //THEN
        assertThat(resultat).isEqualTo(expected);
    }

    @Test
    void devrait_renvoyer_la_liste_des_diviseurs_premiers_de_2() {
        //GIVEN
        int nombre = 2;
        List<Integer> expected = List.of(2);

        //WHEN
        List<Integer> resultat = FacteursPremiers.generer(nombre);

        //THEN
        assertThat(resultat).isEqualTo(expected);
    }
}