
public class Aplicacao {

	public static void main(String[] args) {
		Conta conta=new Conta();
		conta.saldo=0;
		conta.depositar(100);
		conta.cliente.codigo=10;
		conta.cliente.nome="conta";
				conta.numeroConta=1;
		conta.limite=1000;
		
		
		conta.depositar(122);
		
	
		
		conta.saldoDisponivel();
		conta.ImprimeExtrato();
	}

}
