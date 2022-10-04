package Universidade;

import java.time.Year;

public class Estudante {

	/*Atributos - características ou variáveis*/
	String matricula, nome, curso;
	int anoDeIngresso, qtdDisciplinas;
	double valorMensalidade;
	
	/*Métodos (funcionalidades)*/
	public void calculaCredito() {
		
		int resultado = 4 * qtdDisciplinas;
		System.out.println("A quantidade de créditos de: " + nome + " é: " +resultado);
	}
	
	public void calculaAnos() {
		int anoAtual = Year.now().getValue();
		int resultado = anoAtual - anoDeIngresso;
		System.out.println(nome + " já tem " + resultado + " anos na Universidade");
	}
}
