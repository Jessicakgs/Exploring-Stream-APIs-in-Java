import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        List<Aluno> listaAlunos = new ArrayList<>();

        listaAlunos.add(new Aluno("Jessica", 21, 85.0));
        listaAlunos.add(new Aluno("Carlos", 21, 65.5));
        listaAlunos.add(new Aluno("Ana", 15, 90.0));
        listaAlunos.add(new Aluno("Kauan", 21, 70.0));
        listaAlunos.add(new Aluno("Paçoca", 20, 55.0));

        List<Aluno> apenasAprovados = listaAlunos.stream().filter(Aluno::isStatusAprovacao).toList();
        apenasAprovados.forEach(aluno -> System.out.println("Aluno aprovado: " + aluno.getNome()));


        List<String> apenasNomes = listaAlunos.stream().filter(Aluno::isStatusAprovacao).map(Aluno::getNome).toList();

        System.out.println("---------------------- Nomes --------------------");

        apenasNomes.forEach(nomeAluno -> System.out.println("Nome: " + nomeAluno));

        System.out.println("---------------------- Nomes --------------------");

        List<Aluno> notasSuperiores = listaAlunos.stream().filter(aluno -> aluno.getNotaAluno() > 80).toList();
        notasSuperiores.forEach(aluno -> System.out.println("Aluno com nota superior a 80: " + aluno.getNome()));


        List<Aluno> maiorDeIdadeBonus = listaAlunos.stream()
                .filter(aluno -> aluno.getIdade() > 18)
                .map(aluno -> {
                    aluno.setNotaAluno(aluno.getNotaAluno() + 1.0);
                    return aluno;
                }).toList();


        maiorDeIdadeBonus.forEach(aluno -> System.out.println("Aluno maior de 18 com bônus: " + aluno.getNome() + ", nota: " + aluno.getNotaAluno()));



    }

}