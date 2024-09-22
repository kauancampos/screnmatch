package Desafios01;

import java.util.Scanner;

public class Carro {

    Scanner scanner = new Scanner(System.in);

    int anoAtual = 0;

    String modelo;
    int anoDeLancamento;
    String cor;

    void exibeFichaTecnica(){
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Cor: " + cor);
    }
    int anosDoCarro (){
        anoAtual = scanner.nextInt();
        return anoAtual - anoDeLancamento;
    }
}
