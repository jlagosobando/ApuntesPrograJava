package com.mycompany.icc7002;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class GatoV2 {

    public static char n1 = '_', n2 = '_', n3 = '_', n4 = '_', n5 = '_', n6 = '_', n7 = '_', n8 = '_', n9 = '_', marca;

    public static void printTablero() {
        System.out.println("|" + n7 + "|" + n8 + "|" + n9 + "|");
        System.out.println("|" + n4 + "|" + n5 + "|" + n6 + "|");
        System.out.println("|" + n1 + "|" + n2 + "|" + n3 + "|\n");

    }//finprinttablero

    public static boolean hacerMarca(int x) {
        boolean hacerMarca = false;
        switch (x) {
            case 1:
                if (n1 == '_') {
                    n1 = marca;
                    hacerMarca = true;
                } else {
                    System.out.println("casilla ocupada");
                    hacerMarca = false;
                }
                break;
            case 2:
                if (n2 == '_') {
                    n2 = marca;
                    hacerMarca = true;
                } else {
                    System.out.println("casilla ocupada");
                    hacerMarca = false;
                }
                break;
            case 3:
                if (n3 == '_') {
                    n3 = marca;
                    hacerMarca = true;
                } else {
                    System.out.println("casilla ocupada");
                    hacerMarca = false;
                }
                break;
            case 4:
                if (n4 == '_') {
                    n4 = marca;
                    hacerMarca = true;
                } else {
                    System.out.println("casilla ocupada");
                    hacerMarca = false;
                }
                break;
            case 5:
                if (n5 == '_') {
                    n5 = marca;
                    hacerMarca = true;
                } else {
                    System.out.println("casilla ocupada");
                    hacerMarca = false;
                }
                break;
            case 6:
                if (n6 == '_') {
                    n6 = marca;
                    hacerMarca = true;
                } else {
                    System.out.println("casilla ocupada");
                    hacerMarca = false;
                }
                break;
            case 7:
                if (n7 == '_') {
                    n7 = marca;
                    hacerMarca = true;
                } else {
                    System.out.println("casilla ocupada");
                    hacerMarca = false;
                }
                break;
            case 8:
                if (n8 == '_') {
                    n8 = marca;
                    hacerMarca = true;
                } else {
                    System.out.println("casilla ocupada");
                    hacerMarca = false;
                }
                break;
            case 9:
                if (n9 == '_') {
                    n9 = marca;
                    hacerMarca = true;
                } else {
                    System.out.println("casilla ocupada");
                    hacerMarca = false;
                }
                break;
            default:
                hacerMarca = false;

        }
        return hacerMarca;
    }//finhacermarca

    public static void validarCasilla() {
        int casilla = 0;
        Scanner teclado = new Scanner(System.in);

        while (casilla < 1 || casilla > 9) {
            System.out.println("Ingrese casilla para jugar\n");
            casilla = teclado.nextInt();
            if (hacerMarca(casilla) == false) {
                casilla = 0;
            }
        }

    }//finvalidarcasilla

    public static boolean checkGanador() {
        boolean ganador = false;

        if ((((n1 == n5) && (n5 == n9)) || ((n3 == n5) && (n5 == n7))) && n5 != '_') {
            ganador = true;
        }

        if ((((n1 == n2) && (n1 == n3)) || ((n3 == n6) && (n6 == n9))) && n3 != '_') {
            ganador = true;
        }

        if ((((n4 == n5) && (n5 == n6)) || ((n2 == n5) && (n5 == n8))) && n5 != '_') {
            ganador = true;
        }

        if ((((n7 == n8) && (n8 == n9)) || ((n1 == n4) && (n4 == n7))) && n7 != '_') {
            ganador = true;
        }

        return ganador;

    }//fincheck

    public static void main(String[] args) {
        boolean jugar = true;
        boolean hayGanador;
        int contador = 0;

        while (jugar == true) {

            contador++;

            if (contador % 2 == 0) {
                marca = 'O';
            }//finif
            else {
                marca = 'X';
            }//finelse

            System.out.println("\nJuega " + marca + "\n");

            printTablero();
            validarCasilla();
            hayGanador = checkGanador();

            if (hayGanador == true) {
                jugar = false;
                System.out.println("Ganador " + marca);
                printTablero();
            } else {
                if (contador == 9) {
                    System.out.println("Empate");
                    jugar = false;
                    printTablero();
                }
            }

        }//finwhilejugar
    }//finmain
}//finclass
