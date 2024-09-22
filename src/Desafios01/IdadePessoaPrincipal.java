package Desafios01;

import java.util.Scanner;

public class IdadePessoaPrincipal {
    int idade = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IdadePessoa dadosPessoa = new IdadePessoa();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        dadosPessoa.setNome("Kauan");
        dadosPessoa.setIdade(idade);

        dadosPessoa.verificaIdade();
    }
}
