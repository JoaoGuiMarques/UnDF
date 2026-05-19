package ex4;

public class Circulo {

    //atributo
    private double raio;

    //getter
    public double getRaio() {
        return raio;
    }

    //setter
    public void setRaio(double raio) {
        this.raio = raio;
    }

    //calcular área
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    //calcular perímetro
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}