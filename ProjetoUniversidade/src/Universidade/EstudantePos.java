package Universidade;

import java.time.Year;

public class EstudantePos extends Estudante{

	/*M�todos (funcionalidades)*/
	public void calculaCredito() {
		
		int resultado = 2 * qtdDisciplinas;
		System.out.println("A quantidade de cr�ditos de: " + nome + " �: " +resultado);
	}
}
