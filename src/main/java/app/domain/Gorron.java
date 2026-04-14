package app.domain;

public class Gorron extends Invitado {

    public Gorron(String nombre) {
        super(nombre);
        setHambre(90);
        setAburrimiento((int) (Math.random() * 100));
    }

    @Override
    public void corteTarta() {
        setHambre(getHambre() - 30);
        regularEstadisticas();
    }

    @Override
    public void musicaAlta() {
        setHambre(getHambre() - 20);
        regularEstadisticas();
    }

    @Override
    public void musicaBaja() {
        setAburrimiento(getAburrimiento() + 30);
        regularEstadisticas();
    }

    @Override
    public void charlitaColoquial() {
        setAburrimiento(getAburrimiento()+40);
        regularEstadisticas();
    }

    @Override
    public void piniata() {
        setHambre(getHambre()-20);
        regularEstadisticas();
    }

    @Override
    public void aperturaRegalos() {
        setAburrimiento(getAburrimiento()-10);
        regularEstadisticas();
    }

    @Override
    public void baile() {
        setAburrimiento(getAburrimiento()-5);
        setHambre(getHambre()-20);
        regularEstadisticas();
    }

}
