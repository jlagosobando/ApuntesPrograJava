package com.example.testeo;
//recuerden revisar package al copiar
//decidi dejar los sout para que vean como es la misma pass evaluada en cada test
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.example.dev.Main_Pass.*;



public class Pass_Test2 {

    static String pass2check=null;

    @BeforeAll
    public static void setup(){
    pass2check=Gen_Pass();}


    @Test
    public void check_length() {
        int passLength = pass2check.length();;
        Assertions.assertTrue(passLength >= 6 && passLength <= 10);
        System.out.println(pass2check);
    }

    @Test
    public void check_alphanum() {
        System.out.println(pass2check);
        Assertions.assertTrue(pass2check.matches("^[a-zA-Z0-9]*$"));
        System.out.println(pass2check);
    }


    @Test
    public void check_alpha() {
        boolean flag=false;

        for(int i=0;i<pass2check.length();i++){

            if(Character.isAlphabetic(pass2check.charAt(i))){
                flag=true;
                break;
            }
        }
        Assertions.assertTrue(flag);
        System.out.println(pass2check);
    }

    @Test
    public void check_capital(){
        boolean flag=false;

        for(int i=0;i<pass2check.length();i++){

            if (Character.isUpperCase(pass2check.charAt(i))){
                flag=true;
                break;
            }
        }

        Assertions.assertTrue(flag);
        System.out.println(pass2check);
    }

    @Test
    public void check_number(){
        boolean flag=false;


        for(int i=0;i<pass2check.length();i++){

            if (Character.isDigit(pass2check.charAt(i))){
                flag=true;
                break;
            }
        }

        Assertions.assertTrue(flag);
        System.out.println(pass2check);


    }

}