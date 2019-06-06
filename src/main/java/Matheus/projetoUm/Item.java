package Matheus.projetoUm;

public abstract class Item {

	protected String nomeWeapon;
	protected int peso = 0;
	protected int levelMin;
		
	// privado -> só eu posso usar.
	// protected -> só minha familha pode usar.
	// public -> é de todo mundo
	
	public String getNomeWeapon() {
		return nomeWeapon;
	}

	public void setNomeWeapon(String nomeWeapon) {
		this.nomeWeapon = nomeWeapon; 
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso; 
	}

	public int getLevelMin() {
		return levelMin;
	}

	public void setLevelMin(int levelMin) {
		this.levelMin = levelMin;
	}
}
