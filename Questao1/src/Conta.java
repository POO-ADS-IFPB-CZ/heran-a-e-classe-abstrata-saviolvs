public class Conta {
    protected int numero;
    protected String nomeTitular;
    protected double saldo;

    public Conta(int numero, String nomeTitular) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public void exibirSaldo() {
        System.out.println("Conta nº " + numero + " | Titular: " + nomeTitular + " | Saldo: R$ " + saldo);
    }
}