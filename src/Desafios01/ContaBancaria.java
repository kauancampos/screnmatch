package Desafios01;

public class ContaBancaria {

    private int numeroConta;
    private double saldo;
    public String titular;

    void exibeDados(){
        System.out.println("Sua conta é a " + numeroConta +". Seu saldo atual é de R$ " + saldo + ". Senhor " + titular);
    }

    public int getNumeroConta(){
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
