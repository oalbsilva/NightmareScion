package br.nighmateresion.model.item.wand;

import Matheus.projetoUm.ArmaDeMao;
import br.nighmateresion.model.item.Item;

public abstract class Wand extends Item implements ArmaDeMao {

	protected int distanceAtk;
	protected String tipo;

	public int getDistanceAtk() {
		return distanceAtk;
	}

	public String getTipo() {
		return tipo;
	}

	public boolean podeSerUsadoPorPaladino() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean podeSerUsadoPorSorcerer() {
		return true;

	}
	
	public boolean podeSerUsadoPorKnight() {
		return false;

	}
	
	public boolean podeSerUsadoPorDruid() {
		return false;

	}


}
