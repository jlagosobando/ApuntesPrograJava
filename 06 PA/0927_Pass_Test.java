package com.example.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import static com.example.dev.Main_Pass.*;

// meto. creador password alfanum. aleatorias
// pass debe tener una largo entre 6 y 10 *
// es que debe alfanum
// debe tener por lo menos 1 mayus
// debe tener al menos un num


public class Pass_Test {

    static String pass2check = null;

    @BeforeAll
    public static void setUp() {
        pass2check = Gen_Pass();
    }


    @Test
    public void check_length() {
        int largo = pass2check.length();
        Assertions.assertTrue(largo >= 6 && largo <= 10);
    }


    @Test
    public void check_alphanum() {
        Assertions.assertTrue(pass2check.matches("^[a-zA-Z0-9]*$"));
    }


}
