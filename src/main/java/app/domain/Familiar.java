package app.domain;

import java.util.Random;

public class Familiar extends Invitado implements Regalador {

    public Familiar(String nombre) {
        super(nombre);
        setHambre((int) (Math.random() * 30) + 30);
    }

    @Override
    public void corteTarta() {
        comer(10);
        regularEstadisticas();
    }

    @Override
    public void musicaAlta() {
        aburrirse(20);
        pasarHambreTurno();
        regularEstadisticas();
    }

    @Override
    public void musicaBaja() {
        divertirse(20);
        pasarHambreTurno();
        regularEstadisticas();
    }

    @Override
    public void charlitaColoquial() {
        divertirse(20);
        pasarHambreTurno();
        regularEstadisticas();
    }

    @Override
    public void piniata() {
        comer(10);
        divertirse(20);
        regularEstadisticas();
    }

    @Override
    public void aperturaRegalos() {
        divertirse(10);
        regularEstadisticas();
    }

    @Override
    public void baile() {
        divertirse(10);
        pasarHambreTurno();
        regularEstadisticas();
    }


    @Override
    public String darRegalo() {
        String regalo;
        int i = (int) (Math.random() * 2) + 1;
        switch (i) {
            case 1 -> {
                return regalo = Regalos.dinero.toString();
            }
            case 2 -> {
                return regalo = Regalos.ropa.toString();
            }
            default -> throw new IllegalStateException("Unexpected value: " + i);
        }

    }
}
