package Universidade;

import java.time.Year;

public class EstudantePos extends Estudante{

	/*Métodos (funcionalidades)*/
	public void calculaCredito() {
		
		int resultado = 2 * qtdDisciplinas;
		System.out.println("A quantidade de créditos de: " + nome + " é: " +resultado);
	}
}
