package Desafios03;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria();
        minhaConta.depositar(1000);
        minhaConta.consultarSaldo();
        System.out.println();

        //Realizando operações bancárias
        ContaCorrente contacorrente = new ContaCorrente();
        contacorrente.depositar(2000);
        contacorrente.consultarSaldo();
        contacorrente.cobrarTarifaMensal(50);
        contacorrente.sacar(150);
        contacorrente.consultarSaldo();
    }
}
