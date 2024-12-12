import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Conta> contas = new ArrayList<>();

        Conta conta1 = new Conta(1, "João");
        conta1.depositar(1000);
        conta1.sacar(200);
        contas.add(conta1);

        ContaEspecial conta2 = new ContaEspecial(2, "Maria", 500);
        conta2.depositar(800);
        conta2.sacar(1200); // Testando o saque com limite
        contas.add(conta2);

        ContaPoupanca conta3 = new ContaPoupanca(3, "Pedro");
        conta3.depositar(1000);
        conta3.reajustar(10); // Reajustando saldo em 10%
        contas.add(conta3);

        System.out.println("=== Saldo das Contas ===");
        for (Conta conta : contas) {
            conta.exibirSaldo();
        }
    }
}
