package com.aherrmann.facteursPremiers;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class FacteursPremiersTest {

    @Test
    void devrait_renvoyer_la_liste_des_diviseurs_premiers_de_ce_nombre() {
        //GIVEN
        FacteursPremiers facteurs = new FacteursPremiers();
        int nombre = 3;
        List<Integer> expected = List.of(3);

        //WHEN
        List<Integer> resultat = FacteursPremiers.generer(nombre);

        //THEN
        assertThat(resultat).isEqualTo(expected);
    }
}