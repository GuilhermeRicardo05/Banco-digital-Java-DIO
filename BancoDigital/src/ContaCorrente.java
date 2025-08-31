public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();

        
        if (this.getSaldo() > 100) {
            System.out.println("Você pode criar um cartão de crédito com limite mínimo de 80 reais, busque sua agência!");
        }
    }
}
