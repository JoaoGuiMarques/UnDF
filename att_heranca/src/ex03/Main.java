package ex03;

public class Main {
    public static void main(String[] args) {
        //criar objetos
        Produto estadual = new Produto("Produto Estadual", 100, 10);
        ProdutoNacional nacional = new ProdutoNacional("Produto Nacional", 100, 10, 5);
        ProdutoImportado importado = new ProdutoImportado("Produto Importado", 100, 10, 5, 5);

        //exibir dados
        estadual.exibir();
        nacional.exibir();
        importado.exibir();
    }
}