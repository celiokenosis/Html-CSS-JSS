package banco;

import modelos.Conta;

public class Banco {

	public static void main(String[] args) {
	
		Conta a = new Conta("Conta a");
		Conta b = new Conta("Conta b");	
		
		System.out.println("Saldo da conta a: " + a.toString());
		System.out.println("Saldo da conta a: " + b.toString());

		a.depositar(200);
		System.out.println("Saldo da conta a: " + a.toString());
		
		a.sacar(300);
		System.out.println("Saldo da conta a: " + a.toString());
		
		a.sacar(150);
		System.out.println("Saldo da conta a: " + a.toString());


		
	}

}
