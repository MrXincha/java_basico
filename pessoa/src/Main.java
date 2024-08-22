public class Main {
    public static void main(String[] args) {
        Pessoa Pessoa = new Pessoa();
        Pessoa.setNome("Maria");
        Pessoa.setIdade(30);
        Pessoa.setAltura(1.56);

        System.out.println("Nome: " + Pessoa.getNome());
        System.out.println("Anos restantes para aposentadoria: " + Pessoa.calcularAnosAposentadoria());

    }
}
