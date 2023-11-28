package dominio;

import java.util.ArrayList;

public abstract class Profesor {

    protected ArrayList<Merito> meritos;
    protected float valoration;
    protected String nombre;

    public Profesor(String nombre) {
        this.nombre = nombre;
        this.meritos = new ArrayList<Merito>();
        this.valoration = 0;
    }

    public abstract float calcularValoration();

    public Profesor agregarMerito(Merito merito) {
        this.meritos.add(merito);
        return this;
    }
}

