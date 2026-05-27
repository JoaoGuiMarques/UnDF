package ex02;

public class Main {
    public static void main(String[] args) {
        //criar objetos
        Peca peca = new Peca("Placa Mãe", 500, 100);
        PecaImportada pecaImportada = new PecaImportada("Processador", 800, 200, 150, 50);

        //exibir dados
        peca.exibir();
        pecaImportada.exibir();
    }
}