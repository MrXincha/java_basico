public class Pessoa {
    private String nome;
    private int idade;
    private double altura;


public String getNome(){
    return nome;
}

public void setNome(String nome){
    this.nome = nome;
}

public int  idade(){
    return idade;
}

public void setIdade(int idade){
    this.idade = idade;
}

public double setAltura(){
    return altura;
}

public void setAltura(double altura){
    this.altura = altura;
}

public int calcularAnosAposentadoria(){
    return 65 - idade;
}
}
