package com.example.testeo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static com.example.dev.Main_Pass.*;



public class Pass_Test {

    String pass = Gen_Pass();
    @Test
    public void check_length() {
        int passLength = Gen_Pass().length();
        Assertions.assertTrue(passLength >= 6 && passLength <= 10);

    }

    @Test
    public void check_alphanum() {
        String pass2check = Gen_Pass();
        Assertions.assertTrue(pass2check.matches("^[a-zA-Z0-9]*$"));

    }


    @Test
    public void check_alpha() {
        String pass2check = Gen_Pass();
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
        String pass2check =Gen_Pass();
        boolean flag=false;

        for(int i=0;i<pass2check.length();i++){

            if (Character.isUpperCase(pass2check.charAt(i))){
                flag=true;
                break;
            }
        }

        Assertions.assertTrue(flag);
    }

    @Test
    public void check_number(){
        String pass2check =Gen_Pass();
        boolean flag=false;

        for(int i=0;i<pass2check.length();i++){

            if (Character.isDigit(pass2check.charAt(i))){
                flag=true;
                break;
            }
        }

        Assertions.assertTrue(flag);


    }

}