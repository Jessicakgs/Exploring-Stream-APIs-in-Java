import java.util.ArrayList;

public class Aluno {

     private String nome;
     private int idade;
     private double notaAluno;

    public Aluno(String nome, int idade, double notaAluno) {
        this.nome = nome;
        this.idade = idade;
        this.notaAluno = notaAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getNotaAluno() {
        return notaAluno;
    }

    public Aluno setNotaAluno(double notaAluno) {
        this.notaAluno = notaAluno;
        return this;
    }

    public boolean isStatusAprovacao() {
        return this.notaAluno >= 70;
    }

    }

