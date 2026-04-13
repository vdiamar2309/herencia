package app.domain;

public abstract class Invitado {
    private String nombre;
    private int hambre;
    private int aburrimiento;

    public Invitado(String nombre) {
        this.nombre = nombre;
    }

    public abstract void corteTarta();
    public abstract void musicaAlta();
    public abstract void musicaBaja();
    public abstract void charlitaColoquial();
    public abstract void piniata();
    public abstract void aperturaRegalos();


}
