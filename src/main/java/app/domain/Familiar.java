package app.domain;

public class Familiar extends Invitado implements Regalador {

    public Familiar(String nombre) {
        super(nombre);
        setHambre((int) (Math.random() * 100));
        setAburrimiento((int) (Math.random() * 100));
    }

    @Override
    public void corteTarta() {

    }

    @Override
    public void musicaAlta() {

    }

    @Override
    public void musicaBaja() {

    }

    @Override
    public void charlitaColoquial() {

    }

    @Override
    public void piniata() {

    }

    @Override
    public void aperturaRegalos() {

    }

    @Override
    public void baile() {

    }


    @Override
    public void darRegalo() {

    }
}
