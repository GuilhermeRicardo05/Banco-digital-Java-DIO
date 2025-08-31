public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Digital");

        Cliente guilherme = new Cliente("Guilherme");
        Conta ccGuilherme = new ContaCorrente(guilherme);
        Conta poupancaGuilherme = new ContaPoupanca(guilherme);

        banco.adicionarConta(ccGuilherme);
        banco.adicionarConta(poupancaGuilherme);

        Cliente raquel = new Cliente("Raquel");
        Conta ccRaquel = new ContaCorrente(raquel);

        banco.adicionarConta(ccRaquel);

     
        ccGuilherme.depositar(200);
        ccGuilherme.transferir(50, poupancaGuilherme);

        ccGuilherme.imprimirExtrato();
        poupancaGuilherme.imprimirExtrato();
        ccRaquel.imprimirExtrato();
 
   
        banco.listarClientes();
    }
}
