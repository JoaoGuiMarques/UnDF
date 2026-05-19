package ex2;

public class Main {
    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo();

        retangulo.setComprimento(4);
        retangulo.setLargura(8);

        System.out.println("Comprimento do retângulo: " + retangulo.getComprimento());
        System.out.println("Largura do retângulo: " + retangulo.getLargura());
    }
}
