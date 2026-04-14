package app.domain;

public class Colega extends Invitado implements Regalador {

    public Colega(String nombre) {
        super(nombre);
        setHambre((int) (Math.random() * 100));
    }


    @Override
    public void corteTarta() {
        comer(20);
        regularEstadisticas();
    }

    @Override
    public void musicaAlta() {
        divertirse(30);
        pasarHambreTurno();
        regularEstadisticas();
    }

    @Override
    public void musicaBaja() {
        aburrirse(30);
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
        divertirse(20);
        comer(10);
        regularEstadisticas();
    }

    @Override
    public void aperturaRegalos() {
        divertirse(10);
        pasarHambreTurno();
        regularEstadisticas();
    }

    @Override
    public void baile() {
        divertirse(30);
        pasarHambreTurno();
        regularEstadisticas();
    }

    @Override
    public String darRegalo() {
        return "h";
    }
}
