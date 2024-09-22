package Desafios01;

import java.util.Scanner;

public class Calculadora {

    Scanner scanner = new Scanner(System.in);
    int numero = 0;

    int multiplica(){
        numero = scanner.nextInt();
        return numero * 2;

    }
}
