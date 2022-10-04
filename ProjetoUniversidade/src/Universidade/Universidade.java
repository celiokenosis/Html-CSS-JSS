package Universidade;

public class Universidade {

	public static void main(String[] args) {
		
		/*Estudante normal*/
		Estudante e1 = new Estudante();
		
		e1.nome = "Iasmim";
		e1.qtdDisciplinas = 5;
		e1.anoDeIngresso = 2013;
		e1.calculaAnos();
		e1.calculaCredito();

		/*Estudante Pós - herdou tudo do estudante normal*/
		EstudantePos ep1 = new EstudantePos();
		ep1.nome = "Mateus";
		ep1.qtdDisciplinas = 2;
		ep1.anoDeIngresso = 2015;
		ep1.calculaAnos();
		ep1.calculaCredito();
	}
}
