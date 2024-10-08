package nivelIntermediario.desafio05;

public class Main {
    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.consultarSaldo();
        contaCorrente.depositar(1000);


        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.consultarSaldo();
        contaPoupanca.depositar(1000);
    }
}
