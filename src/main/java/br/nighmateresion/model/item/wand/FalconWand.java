package br.nighmateresion.model.item.wand;

import Matheus.projetoUm.BonusMagicLevel;
import br.nighmateresion.model.imbui.DoisSlotImbui;

public class FalconWand extends Wand implements BonusMagicLevel, DoisSlotImbui {

	public FalconWand() {
		this.levelMin = 300;
		this.distanceAtk = 5;
		this.tipo = "Energy";
	}

	public int bonusMagicLevel() {
		return 3;
	}

	public void slotUm() {
		// TODO Auto-generated method stub
		
	}

	public void slotDois() {
		// TODO Auto-generated method stub
		
	}

}
