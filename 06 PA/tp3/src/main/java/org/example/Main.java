package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        // Crear personajes y enemigos
        Protagonista protagonista = new Protagonista("Nemesio", 120, 20, 10, 5);
        Enemigo enemigo1 = new Enemigo("Orco", 50, 15, 5, 2);
        Enemigo enemigo2 = new Enemigo("Goblin", 40, 20, 3, 6);
        Enemigo enemigo3 = new Enemigo("Esqueleto", 60, 12, 8, 3);

        // Crear lista de enemigos
        List<Enemigo> enemigos = new ArrayList<>();
        enemigos.add(enemigo1);
        enemigos.add(enemigo2);
        enemigos.add(enemigo3);
        // Crear juego
        Juego juego = new Juego(protagonista, enemigos);
        // Jugar
        juego.jugar();}




}