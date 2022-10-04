package Universidade;

import java.time.Year;

public class Estudante {

	/*Atributos - caracter�sticas ou vari�veis*/
	String matricula, nome, curso;
	int anoDeIngresso, qtdDisciplinas;
	double valorMensalidade;
	
	/*M�todos (funcionalidades)*/
	public void calculaCredito() {
		
		int resultado = 4 * qtdDisciplinas;
		System.out.println("A quantidade de cr�ditos de: " + nome + " �: " +resultado);
	}
	
	public void calculaAnos() {
		int anoAtual = Year.now().getValue();
		int resultado = anoAtual - anoDeIngresso;
		System.out.println(nome + " j� tem " + resultado + " anos na Universidade");
	}
}
