package Matheus.projetoUm;

import br.nighmateresion.model.item.Item;

public class Sword extends Item implements ArmaDeMao {

	protected void name() {

	}

	public boolean podeSerUsadoPorPaladino() {

		return true;
	}

	public boolean podeSerUsadoPorSorcerer() {

		return true;
	}

	public boolean podeSerUsadoPorKnight() {

		return true;
	}

	public boolean podeSerUsadoPorDruid() {

		return true;
	}

}
