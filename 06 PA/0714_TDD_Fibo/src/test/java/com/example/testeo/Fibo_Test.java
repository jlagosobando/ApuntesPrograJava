package com.example.testeo;
//cuidado con el copy paste para cambiar el nombre del package
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static com.example.dev.Main_Fibo.*;

public class Fibo_Test {

//se corrigió en codigo detalle de escritura en nombre de variable
    @Test
    public void Test_Fibo1() {
        int num_control, num_obtenido;
        num_control = 0;
        num_obtenido = Gen_Fibo(1);

        Assertions.assertEquals(num_control, num_obtenido);
    }

    @Test
    public void Test_Fibo2() {
        int num_control, num_obtenido;
        num_control = 1;
        num_obtenido = Gen_Fibo(2);

        Assertions.assertEquals(num_control, num_obtenido);
    }

    @Test
    public void Test_Fibo3(){
        int num_control, num_obtenido;
        num_control=1;
        num_obtenido=Gen_Fibo(3);

        Assertions.assertEquals(num_control, num_obtenido);

    }

    @Test
    public void Test_Fibo4(){
        int num_control, num_obtenido;
        num_control=2;
        num_obtenido=Gen_Fibo(4);

        Assertions.assertEquals(num_control,num_obtenido);
    }

    @Test
    public void Test_Fibo5(){
        int num_control, num_obtenido;
        num_control=3;
        num_obtenido=Gen_Fibo(5);

        Assertions.assertEquals(num_control,num_obtenido);

    }



    @Test
    public void Test_Serie(){
        int[] serie_control = {0,1,1,2,3,5,8};
        int[] serie_obtenida = Serie_Fibo(serie_control.length);

        Assertions.assertArrayEquals(serie_control,serie_obtenida);
    }


}
