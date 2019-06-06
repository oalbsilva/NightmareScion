package testes;

import junit.framework.TestCase;

public class AppTest extends TestCase {
	public void somaDeUmMaisDoisretornaTres() {
		int numeroUm = 1;
		int numeroDois = 2;
		int resposta = numeroUm + numeroDois + 1;
		assertEquals(3, resposta);
	}

	public void multiplicaCincoComDoisMeioRetornaDozeMeio() {
		double n1 = 5;
		double n2 = 2.5;
		double resultado =  n1 * n2 +1;
		
		assertEquals(12.5, resultado);	
	}
}