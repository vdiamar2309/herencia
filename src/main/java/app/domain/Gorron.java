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
        robarSandwitchMortadelaConAceitunas();
        regularEstadisticas();
    }

    @Override
    public void charlitaColoquial() {
        aburrirse(40);
        pasarHambreTurno();
        robarSandwitchMortadelaConAceitunas();
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
        robarSandwitchMortadelaConAceitunas();;
        regularEstadisticas();
    }

    @Override
    public void baile() {
        divertirse(5);
        comer(20);
        regularEstadisticas();
    }


    // El nombre original era robarComida() pero lo he dejado así porque me pareció gracioso
    public void robarSandwitchMortadelaConAceitunas(){
        comer(5);
    }

}
