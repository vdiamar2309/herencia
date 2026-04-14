package app.domain;

public class Gorron extends Invitado {

    public Gorron(String nombre) {
        super(nombre);
        setHambre(90);
    }

    @Override
    public void corteTarta() {
        comer(30);
        regularEstadisticas();
    }

    @Override
    public void musicaAlta() {
        comer(30);
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
        aburrirse(40);
        pasarHambreTurno();
        regularEstadisticas();
    }

    @Override
    public void piniata() {
        comer(30);
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
        divertirse(5);
        comer(20);
        regularEstadisticas();
    }

}
