package app.domain;

public abstract class Invitado {
    private String nombre;
    private int hambre;
    private int aburrimiento;

    public Invitado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    public void reaccionar(Evento evento){
        switch (evento){
            case baile -> baile();
            case piniata -> piniata();
            case corte_carta -> corteTarta();
            case charlita_coloquial -> charlitaColoquial();
            case musica_alta -> musicaAlta();
            case musica_baja -> musicaBaja();
        }
    }

}
