package dominio;

public class Proyecto extends Merito {

    private int presupuesto;

    public Proyecto(String titulo, int presupuesto) {
        super(titulo);
        this.presupuesto = presupuesto;
        this.setValoration(presupuesto);
    }

    public void setValoration(double valoration) {
        this.valoration = presupuesto / 100000;
    }

    public float getValoration() {
        return this.valoration;
    }
}

