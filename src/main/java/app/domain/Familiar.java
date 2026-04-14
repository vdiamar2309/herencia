package app.domain;

public class Familiar extends Invitado implements Regalador {

    public Familiar(String nombre) {
        super(nombre);
        setHambre((int) (Math.random() * 100));
    }

    @Override
    public void corteTarta() {
    comer(10);
    regularEstadisticas();
    }

    @Override
    public void musicaAlta() {
        regularEstadisticas();
    }

    @Override
    public void musicaBaja() {
        regularEstadisticas();
    }

    @Override
    public void charlitaColoquial() {
        regularEstadisticas();
    }

    @Override
    public void piniata() {
        regularEstadisticas();
    }

    @Override
    public void aperturaRegalos() {
        regularEstadisticas();
    }

    @Override
    public void baile() {
        regularEstadisticas();
    }


    @Override
    public String darRegalo() {
    return "h";
    }
}
