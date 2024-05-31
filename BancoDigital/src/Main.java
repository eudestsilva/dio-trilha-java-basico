
public class Main {

	public static void main(String[] args) {
		Cliente Eudes = new Cliente();
		Eudes.setNome("Eudes");
		
		Conta cc = new ContaCorrente(Eudes);
		Conta poupanca = new ContaPoupanca(Eudes);

		cc.depositar(500);
		cc.transferir(200, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
