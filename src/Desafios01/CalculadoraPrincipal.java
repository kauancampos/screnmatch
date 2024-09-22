package Desafios01;

public class CalculadoraPrincipal {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        System.out.println("Digite um número: ");
        System.out.println("A multiplicação desse número por 2 é: " + calculadora.multiplica());
    }
}
