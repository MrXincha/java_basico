public class Aluno {
    private String nome;
    private String matricula;
    private double mediaFinal;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getMatricula(){
        return matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public double getMediaFinal(){
        return mediaFinal;
    }

    public void setMediaFinal(double mediaFinal){
        this.mediaFinal = mediaFinal;
    }

    public String verificarAprovacao(){
        if (mediaFinal >= 7.0){
            return "Você foi aprovado!";
        }
        else {
            return "Você foi reprovado!";
        }
    }
}
