
public class CriaConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		primeiraConta.agencia = 001;
		primeiraConta.numero = 124;
		primeiraConta.titular = "Mascherano Salomé";
		
		System.out.println(primeiraConta.saldo);
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		System.out.println(primeiraConta.titular);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("O saldo da primeira conta é " + primeiraConta.saldo);
		System.out.println("O saldo da segunda conta é " + segundaConta.saldo);
	}

}
