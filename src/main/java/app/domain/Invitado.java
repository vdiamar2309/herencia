package app.domain;

public abstract class Invitado {
    private String nombre;
    private int hambre;
    private int aburrimiento;

    public Invitado(String nombre) {
        this.nombre = nombre;
        this.aburrimiento = ((int) (Math.random() * 50));
    }

    public String getNombre() {
        return nombre;
    }

    public void regularEstadisticas() {
        if (hambre > 100) {
            this.hambre = 100;
        }
        if (hambre < 0) {
            this.hambre = 0;
        }

        if (aburrimiento > 100) {
            this.aburrimiento = 100;
        }
        if (aburrimiento < 0) {
            this.aburrimiento = 0;
        }
    }

    public void pasarHambreTurno() {
        hambre -= 10;
    }

    public void divertirse(int i) {
        aburrimiento -= i;
    }

    public void comer(int i) {
        hambre -= i;
    }

    public void aburrirse(int i) {
        aburrimiento += i;
    }


    public int getHambre() {
        return hambre;
    }

    public void setHambre(int hambre) {
        this.hambre = hambre;
    }

    public int getAburrimiento() {
        return aburrimiento;
    }

    public void setAburrimiento(int aburrimiento) {
        this.aburrimiento = aburrimiento;
    }

    public abstract void corteTarta();

    public abstract void musicaAlta();

    public abstract void musicaBaja();

    public abstract void charlitaColoquial();

    public abstract void piniata();

    public abstract void aperturaRegalos();

    public abstract void baile();

    public void reaccionar(Evento evento) {
        switch (evento) {
            case baile -> baile();
            case piniata -> piniata();
            case corte_carta -> corteTarta();
            case charlita_coloquial -> charlitaColoquial();
            case musica_alta -> musicaAlta();
            case musica_baja -> musicaBaja();
            case APERTURA_REGALOS -> aperturaRegalos();
        }
    }

}
