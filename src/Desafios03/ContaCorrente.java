package Desafios03;

public class ContaCorrente extends  ContaBancaria{

    private double tarifaMensal;

    public void cobrarTarifaMensal( double tarifaMensal){
        saldo -= tarifaMensal;
        System.out.println("Taria mensal de R$ " +tarifaMensal + " foi cobrada. Seu saldo é de R$ " + saldo);
    }
}
