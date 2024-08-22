public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome ("Carro");
        produto.setPreco(27900.00);
        produto.setQuantidade(8);

        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preco: " + produto.getPreco());
        System.out.println("Valor total em estoque: " + produto.calcularValorEstoque());
    }
}
