package com.example.testeo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Assertions;


import static com.example.dev.Main_Pass.*;

// meto. creador password alfanum. aleatorias
// pass debe tener una largo entre 6 y 10 *
// es que debe alfanum *
// debe tener al menos una letra *
// debe tener por lo menos 1 mayus *
// debe tener al menos un num *

//tareas o ideas:
// añadir que contenga al menos un caracter especiañ
// añadir que mayuscula y numero estén en cualquier lugar de la cadena
// verificar repeat para suite de pruebas
public class Pass_Test {

    static String pass2check = null;

    @BeforeAll
    public static void setUp() {
        pass2check = Gen_Pass();
        System.out.println(pass2check);
    }

    @Test
    public void check_length(){
        int largo = pass2check.length();
        Assertions.assertTrue(largo >= 6 && largo <= 10);

    }

    @Test
    public void check_alphanum() {
        Assertions.assertTrue(pass2check.matches("^[a-zA-Z0-9]*$"));
    }


    @Test
    public void check_alpha(){
        boolean flag=false;

        for(int i=0;i<pass2check.length();i++){
            if(Character.isAlphabetic(pass2check.charAt(i))){
                flag=true;
                break;
            }
        }
        Assertions.assertTrue(flag);
    }

    @Test
    public void check_capital(){
        boolean flag=false;

        for(int i=0;i<pass2check.length();i++){
            if(Character.isUpperCase(pass2check.charAt(i))){
                flag=true;
                break;
            }
        }

        Assertions.assertTrue(flag);

    }

    @Test
    public void check_number(){
        boolean flag=false;

        for(int i=0;i<pass2check.length();i++){
            if(Character.isDigit(pass2check.charAt(i))){
                flag=true;
                break;
            }
        }

        Assertions.assertTrue(flag);

    }






}