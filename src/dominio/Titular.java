package dominio;

public class Titular extends Profesor {
    public Titular(String nombre) {
        super(nombre);
    }

    public float calcularValoration() {
        float valoration = 0;
        for (Merito merito : this.meritos) {
            // añadir mérito
            valoration += merito.getValoration();
        }
        // calcular promedio aritmético
        valoration = valoration / this.meritos.size();
        return valoration;
    }
}

