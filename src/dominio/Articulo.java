package dominio;

public class Articulo extends Merito {

    private float impact;

    public Article(String title, double impact) {
        super(title);
        this.impact = Float.parseFloat(String.valueOf(impact));
        this.setValoration(this.impact);
    }

    public void setValoration(float valoration) {
        this.valoration = valoration;
    }

    public float getValoration() {
        return this.valoration;
    }
}

