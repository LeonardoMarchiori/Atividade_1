public class Contas {

    public static void main(String[] args) {

        ContaEspecial especial = new ContaEspecial();
        especial.setSaldo(100f);
        especial.setCliente("Cliente da conta especial");
        especial.setNumConta(1);

        especial.sacar(100f);
        especial.depositar(200f);

        System.out.println(especial.mostrarSaldoComLimite());

        ContaPoupanca poupanca = new ContaPoupanca();
        poupanca.setSaldo(200f);
        poupanca.setCliente("Cliente conta poupança");
        poupanca.setNumConta(2);

        poupanca.sacar(150f);
        poupanca.depositar(50f);

        System.out.println(poupanca.mostrarSaldoComLimite());;


    }


}
