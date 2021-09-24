//cuidado con el copy paste para cambiar el nombre del package
package com.example.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.example.dev.Main_Fibo.*;

// 1,2,3,4,5,6,7,8
// 0,1,1,2,3,5,8,13...

public class Fibo_Test{

//comprobar que el 1er num de la serie sea 0
    @Test
    public void Test_Fibo1(){
        int num_control,num_obtenido;
        num_control=0;
        num_obtenido=Gen_Fibo(1);
        Assertions.assertEquals(num_control,num_obtenido);
    }

//comprobar que el 2do num de la serie sea 1
    @Test
    public void Test_Fibo2(){
        int num_control,num_obtenido;
        num_control=1;
        num_obtenido=Gen_Fibo(2);
        Assertions.assertEquals(num_control,num_obtenido);
    }

//comprobar que los numeros se gen sg los anteriores
//3er elemento de la serie es 1
    @Test
    public void Test_Fibo3(){
        int num_control,num_obtenido;
        num_control=1;
        num_obtenido=Gen_Fibo(3);
        Assertions.assertEquals(num_control,num_obtenido);
    }

//4to elemento de la serie es 2
    @Test
    public void Test_Fibo4(){
        int num_control,num_obtenido;
        num_control=2;
        num_obtenido=Gen_Fibo(4);
        Assertions.assertEquals(num_control,num_obtenido);
}

    //5to elemento de la serie es 3
    @Test
    public void Test_Fibo5(){
        int num_control,num_obtenido;
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
