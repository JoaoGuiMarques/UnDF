package ex4;

public class Main {

    public static void main(String[] args) {

        Circulo circulo = new Circulo();

        circulo.setRaio(5);

        System.out.println("Raio: " + circulo.getRaio());
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());
    }
}
