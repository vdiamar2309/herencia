package app;

import app.domain.*;

import java.util.ArrayList;

import app.domain.Invitado;

public class MainAlumnos {
    private static final int ROPA_MAX = 4;
    private static int contadorRopa = 0;

    static void main() {
        System.out.println("--- ¡COMIENZA EL CUMPLE DE LOLO! ---");

        // TODO 1: Crea un Array de Invitados de tamaño 10.
        ArrayList<Invitado> invitados = getInvitados();


        int ronda = 1;
        boolean fiestaSigue = true;
        boolean yaSeAbrieronRegalos = false;

        // Bucle de la fiesta (máximo 10 rondas)
        while (fiestaSigue && ronda <= 10) {

            System.out.println("\n--- RONDA " + ronda + " ---");
            Evento eventoActual = obtenerEventoAleatorio();
            System.out.println("Evento: " + eventoActual);

            // Evitamos que se abran regalos dos veces

            eventoActual = obtenerEventoAleatorio();


            // TODO 3: Recorre el array de invitados
            // 1. Cuidado con las posiciones null del array.
            // 2. Verifica si el invitado sigue en la fiesta.
            // 3. Haz que reaccione al evento (gestiona las excepciones).
            // 4. Si es APERTURA_REGALOS y el invitado es regalador:
            //    - Pide el regalo (imprímelo por pantalla).
            reaccionar(invitados, eventoActual);

            if (eventoActual.toString().equals("APERTURA_REGALOS")) {

                String regalo;
                for (Invitado i : invitados) {
                    i.reaccionar(Evento.APERTURA_REGALOS);
                    if (i instanceof Regalador regalador) {
                        regalo = regalador.darRegalo();
                        System.out.println(i.getNombre() + " ha regalado " + regalo);
                        if (regalo.equals("ropa")) {
                            contadorRopa++;
                        }
                    }
                }


                yaSeAbrieronRegalos = true;
            }
            // TODO 4: Chequeo de fin de fiesta
            // - Si se han regalado 4 prendas de ropa -> Mensaje de decepción.
            // -  Si no queda nadie en la fiesta -> Fin con mensaje.


            if (contadorRopa == ROPA_MAX) {
                System.out.println("Esta fiesta es un rollo, todo el mundo regala ropa. Cada uno pa su\n" +
                        "casa\n");
                fiestaSigue = false;
            } else {
                contadorRopa = 0;
            }

            if (invitados.isEmpty()) {
                System.out.println("Se ha ido todo el mundo. Vaya mojón de fiesta, Lolo\n");
                fiestaSigue = false;
            }
            ronda++;

        }
        System.out.println("--- FIN DE LA FIESTA ---");
    }

    public static void reaccionar(ArrayList<Invitado> invitados, Evento eventoActual) {
        boolean eliminarAnterior=false;
        int j = 0;
        for (int i = 0; i < invitados.size(); i++) {
            if (eliminarAnterior){
                invitados.remove(j);
            }

            invitados.get(i).reaccionar(eventoActual);
            if (invitados.get(i).getAburrimiento() == 100) {
                if (!(invitados.get(i) instanceof Gorron)) {
                    System.out.println(invitados.get(i).getNombre() + "  se ha ido por aburrimiento");
                    j=i;
                    eliminarAnterior=true;
                }
            }
            if (!(invitados.get(i) instanceof Gorron)) {
                if (invitados.get(i).getHambre() == 100) {
                    System.out.println(invitados.get(i).getNombre() + "  se ha ido hambriento de la fiesta");
                    j=i;
                    eliminarAnterior=true;
                }
            }
            if (invitados.get(i) instanceof Gorron) {
                if (invitados.get(i).getHambre() == 0) {
                    System.out.println("Después de robarle no dejar ni las migas sandwiches de mortadela de los niños... ");
                    System.out.println(invitados.get(i).getNombre() + " se va de la fiesta hasta arriba de comida. ¡Adiós\n" +
                            "pringaos!\n");
                    j=i;
                    eliminarAnterior=true;
                }
            }
        }
    }

    private static ArrayList<Invitado> getInvitados() {
        ArrayList<Invitado> invitados = new ArrayList<>();

        // TODO 2: Rellena las primeras posiciones:
        // - 3 Familiares (con nombres y stats aleatorios)
        Familiar layaya = new Familiar("La Yaya");
        Familiar ertio = new Familiar("Er tio");
        Familiar lamama = new Familiar("LA MAMA");
        // - 3 Colegas (con nombres y stats aleatorios)
        Colega sebastian = new Colega("Sebastián");
        Colega mariangeles = new Colega("Mari Angeles");
        Colega tirado = new Colega("Manuel Tirado");
        // - 1 Gorrón
        // Lo he hecho por la broma de que alguien te puso de gorrón
        Gorron bermudo = new Gorron("Bermudo");
        // PISTA: Usa un contador para saber en qué posición del array insertas.

        // Mejor uso un arraylist
        invitados.add(bermudo);
        invitados.add(tirado);
        invitados.add(sebastian);
        invitados.add(mariangeles);
        invitados.add(lamama);
        invitados.add(ertio);
        invitados.add(layaya);
        return invitados;
    }

    private static Evento obtenerEventoAleatorio() {
        // TODO 5: Obtener un evento aleatorio
        int i = (int) (Math.random() * 7) + 1;
        return switch (i) {
            case 1 -> Evento.APERTURA_REGALOS;
            case 2 -> Evento.baile;
            case 3 -> Evento.piniata;
            case 4 -> Evento.musica_baja;
            case 5 -> Evento.musica_alta;
            case 6 -> Evento.corte_carta;
            case 7 -> Evento.charlita_coloquial;
            default -> throw new IllegalStateException("Unexpected value: " + i);
        };
    }
}