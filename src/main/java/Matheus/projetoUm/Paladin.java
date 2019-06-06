package Matheus.projetoUm;

public class Paladin extends Personagem {

	@Override
	public String vocacao() {		
		return "Paladin"; 
	}
	
	@Override
	public boolean equipaArma(ArmaDeMao arma) {	
		// se essa arma nao puder ser usada por paladino, retorna falso
		if(arma.podeSerUsadoPorPaladino())		
			return super.equipaArma(arma);
		return false;
	}

}
