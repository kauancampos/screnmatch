package Desafios03;

public class ContaBancaria {
    protected double saldo;

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar (double valor){
        if (valor <= saldo){
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado. Saldo atual é de R$ " + saldo);
        } else {
            System.out.println("Saldo insuficinete");
        }
    }

    public void consultarSaldo(){
        System.out.println("Saldo atual: " + saldo);
    }
}
