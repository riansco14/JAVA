
public class Conta {
int numeroConta;
double saldo=0;
double limite=100;

Cliente cliente=new Cliente();
Agencia agencia;

void depositar(double valor)
{	
	if((this.saldo+valor)>limite)
	System.out.println("Limite atingido");
	else this.saldo += valor;
}
void saque(double valor){
	this.saldo -= valor;
}

void saldoDisponivel(){
	System.out.println(saldo);
}
void ImprimeExtrato(){
	this.ImprimeExtrato(15);
}
void ImprimeExtrato(int valor){
	System.out.println("\nExtrato "+valor+"Dias"+"\nNome:" +this.cliente.nome+"\nCodigo: "+this.cliente.codigo+"\nSaldo: "+this.saldo+"\nLimite do Cartão: "+this.limite+"\nNumero da Conta:"+this.numeroConta);
}
}