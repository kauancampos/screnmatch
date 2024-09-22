package Desafios01;

public class AlunosPrincipal {
    public static void main(String[] args) {
        Alunos dadosDosAlunos1 = new Alunos("Kauan", 7.8, 8.4, 5.5);
        Alunos dadosDosAlunos2 = new Alunos("Gabriella", 9.4, 8.4, 8.5);

        System.out.println("Nome do aluno: " + dadosDosAlunos1.getNome());
        System.out.println("Nota 1: " + dadosDosAlunos1.getNota1());
        System.out.println("Nota 2: " + dadosDosAlunos1.getNota2());
        System.out.println("Nota 3: " + dadosDosAlunos1.getNota3());
        System.out.println("Média das notas: " + dadosDosAlunos1.calcularMedia());
        System.out.println();

        System.out.println("Nome do aluno: " + dadosDosAlunos2.getNome());
        System.out.println("Nota 1: " + dadosDosAlunos2.getNota1());
        System.out.println("Nota 2: " + dadosDosAlunos2.getNota2());
        System.out.println("Nota 3 " + dadosDosAlunos2.getNota3());
        System.out.println("Média das notas: " + dadosDosAlunos2.calcularMedia());
    }
}
