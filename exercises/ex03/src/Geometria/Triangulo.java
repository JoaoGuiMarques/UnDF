package Geometria;

public class Triangulo {
    //atributos
    double a;
    double b;
    double c;

    //métodos calcular área
    public double calcularArea() {
        double p = (a+b+c) / 2;
        double area = Math.sqrt(p * (p-a) * (p-b) * (p-c));
        return area;
    }
}
