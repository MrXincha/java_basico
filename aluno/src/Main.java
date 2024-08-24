public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Maria");
        aluno.setMatricula("0101230824");
        aluno.setMediaFinal(8.5);
        
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Matricula: " + aluno.getMatricula());
        System.out.println("Media final: " + aluno.getMediaFinal());
        System.out.println(aluno.verificarAprovacao());
    }
}
