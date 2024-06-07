package org.example;

import java.util.List;
import java.util.Random;

public class Juego {
    private Protagonista protagonista;
    private List<Enemigo> enemigos;
    private Random rand;
    private List<String[]> resultados;

    public Juego(Protagonista protagonista, List<Enemigo> enemigos) {
        this.protagonista = protagonista;
        this.enemigos = enemigos;
        this.rand = new Random();
    }

    public void jugar() {
        List<String[]> resultados = GestorDatos.cargarResultados(); // cargar resultados previos
        for (Enemigo enemigo : enemigos) {
            while (protagonista.estaVivo() && enemigo.estaVivo()) {
                Personaje primero, segundo;
                if (protagonista.velocidad > enemigo.velocidad) {
                    primero = protagonista;
                    segundo = enemigo;
                } else if (enemigo.velocidad > protagonista.velocidad) {
                    primero = enemigo;
                    segundo = protagonista;
                } else {
                    primero = rand.nextBoolean() ? protagonista : enemigo;
                    segundo = primero == protagonista ? enemigo : protagonista;
                }
                primero.atacar(segundo);
            }
            String[] resultado = new String[]{protagonista.getNombre(), enemigo.getNombre(),
                    protagonista.getVida() > 0 ? "victoria" : "derrota"};
            resultados.add(resultado);
            GestorDatos.guardarResultados(resultados); // guardar resultados actualizados

            protagonista.shuffleSpeed();
        }
    }

    public List<String[]> getResultados() {
        return resultados;
    }
}


