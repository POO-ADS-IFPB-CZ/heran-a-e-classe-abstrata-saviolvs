public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(int numero, String nomeTitular, double limite) {
        super(numero, nomeTitular);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= saldo + limite) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public void exibirSaldo() {
        System.out.println("Conta Especial nº " + numero + " | Titular: " + nomeTitular +
                " | Saldo: R$ " + saldo + " | Limite: R$ " + limite);
    }
}