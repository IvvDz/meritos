package dominio;

public class Catedratico extends Profesor {
    public Catedratico(String name) {
        super(name);
    }

    public float calculateValoration() {
        float valoration = 0;
        for (Merito merito : this.meritos) {
            valoration += (merit.getValoration() * merit.getValoration());
        }
        // calcular la raíz cuadrada del promedio aritmético
        valoration = (float) Math.sqrt(valoration / this.merits.size());
        return valoration;
    }
}

