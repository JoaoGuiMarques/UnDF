package Geometria;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //criar objetos
        Triangulo x = new Triangulo();
        Triangulo y = new Triangulo();

        //dados do triângulo X
        System.out.println("Digite os lados do triângulo X:");
        x.a = scanner.nextDouble();
        x.b = scanner.nextDouble();
        x.c = scanner.nextDouble();

        //dados do triângulo Y
        System.out.println("Digite os lados do triângulo Y:");
        y.a = scanner.nextDouble();
        y.b = scanner.nextDouble();
        y.c = scanner.nextDouble();

        //calcular áreas
        double areaX = x.calcularArea();
        double areaY = y.calcularArea();

        //mostrar resultados
        System.out.println("Área do triângulo X: " + areaX);
        System.out.println("Área do triângulo Y: " + areaY);

        //comparar
        if (areaX > areaY) {
            System.out.println("Triângulo X possui a maior área");
        } else {
            System.out.println("Triângulo Y possui a maior área");
        }

        scanner.close();
    }
}