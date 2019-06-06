package Matheus.projetoUm;

public abstract class Personagem {

	private String nome; 
	private int level = 1;
	private int axeFighting = 10;
	private int shielding = 10;
	private int experienciaTotal = 1;
	private int magicLevel = 10;
	private int distanceFighting = 10;
	public abstract String vocacao();
	
	private Inventorio inventorio;	
	
	public Personagem() {
		inventorio = new Inventorio();
	}
	
	public boolean equipaArma(ArmaDeMao arma) {
		inventorio.equipaArma(arma); 
		return true;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getAxeFighting() {
		return axeFighting;
	}

	public void setAxeFighting(int axeFighting) {
		this.axeFighting = axeFighting;
	}

	public int getShielding() {
		return shielding;
	}

	public void setShielding(int shielding) {
		this.shielding = shielding;
	}

	public int getExperienciaTotal() {
		return experienciaTotal;
	}

	public void setExperienciaTotal(int experienciaTotal) {
		this.experienciaTotal = experienciaTotal;
	}

	public int getMagicLevel() {
		return magicLevel;
	}

	public void setMagicLevel(int magicLevel) {
		this.magicLevel = magicLevel;
	}

	public int getDistanceFighting() {
		return distanceFighting;
	}

	public void setDistanceFighting(int distanceFighting) {
		this.distanceFighting = distanceFighting;
	}
	
}
