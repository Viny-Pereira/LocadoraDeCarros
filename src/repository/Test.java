package src.repository;

import java.lang.annotation.Retention;

// Clase abstracta
abstract class Figura {
    // Atributos comunes a todas las figuras
    String color;

    // Constructor
    public Figura(String color) {
        this.color = color;
    }

    // Método abstracto para calcular el área (debe implementarse en las subclases)
    public abstract double calcularArea();

    // Método concreto
    public void mostrarColor() {
        System.out.println("El color de la figura es " + color);
    }
}

// Clase que extiende la clase abstracta Figura (subclase)
class Circulo extends Figura {
    double radio;

    // Constructor
    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    // Implementación del método abstracto calcularArea para un círculo
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

// Clase que extiende la clase abstracta Figura (subclase)
class Rectangulo extends Figura {
    double ancho;
    double alto;

    // Constructor
    public Rectangulo(String color, double ancho, double alto) {
        super(color);
        this.ancho = ancho;
        this.alto = alto;
    }

    // Implementación del método abstracto calcularArea para un rectángulo
    @Override
    public double calcularArea() {
        return ancho * alto;
    }
}

public class Test {
    public static void main(String[] args) {
        Circulo circulo = new Circulo("Rojo", 5.0);
        Rectangulo rectangulo = new Rectangulo("Azul", 4.0, 6.0);

        circulo.mostrarColor();
        System.out.println("Área del círculo: " + circulo.calcularArea());

        rectangulo.mostrarColor();
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
    }
}