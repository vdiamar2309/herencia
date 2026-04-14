package app;

import app.domain.Colega;

public class pruebas {
    static void main(String[] args) {
        Colega c = new Colega("Hola");



        c.setAburrimiento(101);
        c.setHambre(101);

        c.regularEstadisticas();
        System.out.println(c.getAburrimiento());
        System.out.println(c.getHambre());

    }
}
