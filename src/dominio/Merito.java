package dominio;

public class Merito {
    protected String titulo;
    protected float valoration;

    public Merito(String titulo) {
        this.titulo = titulo;
    }

    public float getValoration() {
        return this.valoration;
    }
}

