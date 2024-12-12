public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numero, String nomeTitular) {
        super(numero, nomeTitular);
    }

    public void reajustar(double percentual) {
        saldo += saldo * (percentual / 100);
    }

    @Override
    public void exibirSaldo() {
        System.out.println("Conta Poupança nº " + numero + " | Titular: " + nomeTitular +
                " | Saldo: R$ " + saldo);
    }
}