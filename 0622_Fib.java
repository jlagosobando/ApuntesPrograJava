/* @author pancho
* Autor Original Profesor Francisco Escobar
*/
package com.mycompany.icc7002;

// 1, 1, 2, 3, 5, 8, 13...

public class Fib {
    public static void main(String[] args) {
        System.out.println("Fibonacci");
        int f1 = 1;
        int f2 = 1;
        int fn = 1;
        
        for(int i=0;i<10;i++){
            System.out.println(f1);
            fn=f1+f2;
            f1=f2;
            f2=fn;
        }
        
    }
}
