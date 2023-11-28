package aplicacion;
import dominio.*;

public class Main {
    public static void main(String[] args) {
        // El primer parámetro del constructor es el título y, el
        // segundo, el índice de impacto.
        Articulo articulo1 = new Articulo("El gran invento", 1.367);
        Articulo articulo2 = new Articulo("Lo nunca visto", 2.765);
        Articulo articulo3 = new Articulo("Pasen y vean", 1.987);
        Articulo articulo4 = new Articulo("El no va más del " + "qué se yo", 2.134);

        // El primer parámetro del constructor es el título y, el
        // segundo, la financiación con la que ha contado el proyecto.
        Proyecto proyecto1 = new Proyecto("El puente de " + "Villar del Río", 1000000);
        Proyecto proyecto2 = new Proyecto("El acueducto de " + "Villar del Campo", 2000000);
        Proyecto proyecto3 = new Proyecto("El sistema de " + "información de " + "Villar del Río", 1200000);

        Titular t1 = new Titular();

        // Se añaden al profesor los artículos que ha publicado.
        t1.addMerit(articulo1);
        t1.addMerit(articulo2);

        // Se añade al profesor el proyecto en el que ha participado.
        t1.addMerit(proyecto1);

        // Se procede con el catedrático de forma análoga a como
        // se ha procedido con el profesor titular.
        Catedratico ct1 = new Catedratico();
        ct1.addMerito(articulo3);
        ct1.addMerito(articulo4);
        ct1.addMerito(proyecto2);
        ct1.addMerito(proyecto3);

        // Se muestra la valoración tanto del profesor titular
        // como del catedrático
        System.out.println("La valoración de profesor titular t1 es " + t1.calculateValoration());
        System.out.println("La valoración del catedrático ct1 es " + ct1.calculateValoration());
    }
}

