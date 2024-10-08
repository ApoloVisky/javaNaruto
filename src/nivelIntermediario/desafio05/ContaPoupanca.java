package nivelIntermediario.desafio05;

public class ContaPoupanca extends ContaBancaria{

    TipoConta tipoConta = TipoConta.CONTA_POUPANCA;



    @Override
    public void consultarSaldo() {
        System.out.println("Saldo atual da conta: " + saldo);

    }

    @Override
    public void depositar(double valor) {
        saldo += valor - (valor * 0.01);
        System.out.println("Saldo atual da conta com taxa de 1%: " + saldo);
    }
}
