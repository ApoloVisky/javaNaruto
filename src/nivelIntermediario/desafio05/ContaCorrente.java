package nivelIntermediario.desafio05;

public class ContaCorrente  extends ContaBancaria{

    TipoConta tipoConta = TipoConta.CONTA_CORRENTE;


    @Override
    public void consultarSaldo() {
        System.out.println("Saldo atual da conta: " + saldo);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Saldo atual da conta: " + saldo);

    }
}
