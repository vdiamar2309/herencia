package app;

import app.domain.*;
import app.exceptions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import app.domain.Invitado;

public class MainAlumnos {
    private static final int ROPA_MAX = 4;

    public static void main(String[] args) {
        System.out.println("--- ¡COMIENZA EL CUMPLE DE LOLO! ---");

        // TODO 1: Crea un Array de Invitados de tamaño 10.
        ArrayList<Invitado> invitados = new ArrayList<>();

        // TODO 2: Rellena las primeras posiciones:
        // - 3 Familiares (con nombres y stats aleatorios)
        Familiar layaya = new Familiar("la yaya");
        Familiar ertio = new Familiar("Er tio");
        Familiar lamama = new Familiar("lamama");
        // - 3 Colegas (con nombres y stats aleatorios)
        Colega toscano = new Colega("Toscano");
        Colega isaac = new Colega("Isaac");
        Colega tirado = new Colega("Manuel Tirado");
        // - 1 Gorrón
        // Lo he hecho por la broma de que alguien te puso de gorrón
        Gorron bermudo = new Gorron("Bermudo");
        // PISTA: Usa un contador para saber en qué posición del array insertas.

        // Mejor uso un arraylist
        invitados.add(bermudo);
        invitados.add(tirado);
        invitados.add(toscano);
        invitados.add(isaac);
        invitados.add(lamama);
        invitados.add(ertio);
        invitados.add(layaya);


        int ronda = 1;
        boolean fiestaSigue = true;
        boolean yaSeAbrieronRegalos = false;

        // Bucle de la fiesta (máximo 10 rondas)
        while (fiestaSigue && ronda <= 10) {
            System.out.println("\n--- RONDA " + ronda + " ---");
            Evento eventoActual = obtenerEventoAleatorio();
            System.out.println("Evento: " + eventoActual);

            // Evitamos que se abran regalos dos veces
            while (eventoActual == Evento.APERTURA_REGALOS && yaSeAbrieronRegalos) {
                eventoActual = obtenerEventoAleatorio();
            }

            System.out.println("Evento: " + eventoActual);

            // TODO 3: Recorre el array de invitados
            // 1. Cuidado con las posiciones null del array.
            // 2. Verifica si el invitado sigue en la fiesta.
            // 3. Haz que reaccione al evento (gestiona las excepciones).
            // 4. Si es APERTURA_REGALOS y el invitado es regalador:
            //    - Pide el regalo (imprímelo por pantalla).


            // TODO 4: Chequeo de fin de fiesta
            // - Si se han regalado 4 prendas de ropa -> Mensaje de decepción.
            // - Si no queda nadie en la fiesta -> Fin con mensaje.

            ronda++;
        }
        System.out.println("--- FIN DE LA FIESTA ---");
    }

    private static Evento obtenerEventoAleatorio() {
        // TODO 5: Obtener un evento aleatorio
        throw new UnsupportedOperationException("Rellena el código");
    }
}