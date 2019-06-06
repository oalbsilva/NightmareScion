package personagem;

import Matheus.projetoUm.Axe;
import Matheus.projetoUm.Druid;
import Matheus.projetoUm.Knight;
import Matheus.projetoUm.Paladin;
import Matheus.projetoUm.Personagem;
import Matheus.projetoUm.Sorcerer;
import br.nighmateresion.model.item.wand.FalconWand;
import br.nighmateresion.model.item.wand.Wand;
import junit.framework.TestCase;

public class TestaPersonagem extends TestCase {

	// testeCriacaoPersonagem
	public void testaPersonagemMikatral() {

		Personagem mikatral = criaPersonagemMikatral();

		String nome = mikatral.getNome();
		int level = mikatral.getLevel();
		int axeFighting = mikatral.getAxeFighting();
		int shielding = mikatral.getShielding();
		int experienciaTotal = mikatral.getExperienciaTotal();
		String vocacao = mikatral.vocacao();

		assertEquals("Mikatral", nome);
		assertEquals(92, axeFighting);
		assertEquals(88, shielding);
		assertEquals(20347845, experienciaTotal);
		assertEquals(161, level);
		assertEquals("Knight", vocacao);

	}

	public void testaPersonagemMario() {

		Personagem mario = criarPersonagemMario();

		String nome = mario.getNome();
		int level = mario.getLevel();
		int axeFighting = mario.getAxeFighting();
		int shielding = mario.getShielding();
		int experienciaTotal = mario.getExperienciaTotal();
		String vocacao = mario.vocacao();
		int magicLevel = mario.getMagicLevel();

		assertEquals("Gieland", nome);
		assertEquals(10, axeFighting);
		assertEquals(28, shielding);
		assertEquals(2588875, experienciaTotal);
		assertEquals(200, level);
		assertEquals("Sorcerer", vocacao);
		assertEquals(95, magicLevel);

	}

	public void testaPersonagemProfessor() {

		Personagem espindola = criaPersonagemProfessor();

		String nome = espindola.getNome();
		int level = espindola.getLevel();
		int axeFigthing = espindola.getAxeFighting();
		int shielding = espindola.getShielding();
		int experienciaTotal = espindola.getExperienciaTotal();
		String vocacao = espindola.vocacao();
		int magicLevel = espindola.getMagicLevel();

		assertEquals("Professor Espindola", nome);
		assertEquals(10, axeFigthing);
		assertEquals(32, shielding);
		assertEquals(25588875, experienciaTotal);
		assertEquals(358, level);
		assertEquals("Druid", vocacao);
		assertEquals(105, magicLevel);

	}

	public void testaPersonagemFe() {

		Personagem fe = criaPersonagemFe();

		String nome = fe.getNome();
		int level = fe.getLevel();
		int axeFighting = fe.getAxeFighting();
		int shielding = fe.getShielding();
		int experienciaTotal = fe.getExperienciaTotal();
		String vocacao = fe.vocacao();
		int magicLevel = fe.getMagicLevel();
		int distanceFighting = fe.getDistanceFighting();

		assertEquals("Actfix", nome);
		assertEquals(10, axeFighting);
		assertEquals(98, shielding);
		assertEquals(235789999, experienciaTotal);
		assertEquals(340, level);
		assertEquals("Paladin", vocacao);
		assertEquals(38, magicLevel);
		assertEquals(110, distanceFighting);
	}

	// --------------------------------------------------------------------------
	// ItensTest

	public void testaCriaWand() {
		Wand wand = new FalconWand();	
		FalconWand falconWand = new FalconWand();	
	}

	public void testaCriaAxe() {

		Axe axe = new Axe();

		axe.setNomeWeapon("Falcon Batlle Axe");
		axe.setPeso(130);

		String nomeWeapon = axe.getNomeWeapon();
		int peso = axe.getPeso();
		int levelMin = axe.getLevelMin();
		int bonusAxeFighting = axe.getBonusAxeFighting();

	}	
	
	public void testaEquipaFalconWandNoMario() {
		Personagem mario = criarPersonagemMario();
		FalconWand falconWand = new FalconWand();
		
		boolean equipouAArma = mario.equipaArma(falconWand);
		assertEquals(true, equipouAArma);
	}
	
	public void testaEquipaFalconWandNoFe() {
		Personagem fe = criaPersonagemFe();
		FalconWand falconWand = new FalconWand();
		
		boolean equipouAArma = fe.equipaArma(falconWand);
		assertEquals(false, equipouAArma);
	}

	private Personagem criaPersonagemFe() {
		Personagem fe = new Paladin();

		fe.setNome("Actfix");
		fe.setLevel(340);
		fe.setDistanceFighting(110);
		fe.setExperienciaTotal(235789999);
		fe.setMagicLevel(38);
		fe.setShielding(98);
		return fe;
	}

	private Personagem criaPersonagemProfessor() {
		Personagem espindola = new Druid();

		espindola.setNome("Professor Espindola");
		espindola.setLevel(358);
		espindola.setShielding(32);
		espindola.setMagicLevel(105);
		espindola.setExperienciaTotal(25588875);
		return espindola;
	}

	private Personagem criarPersonagemMario() {
		Personagem mario = new Sorcerer();
		mario.setNome("Gieland");
		mario.setExperienciaTotal(2588875);
		mario.setLevel(200);
		mario.setMagicLevel(95);
		mario.setShielding(28);
		return mario;
	}

	private Personagem criaPersonagemMikatral() {
		Personagem mikatral = new Knight();
		mikatral.setNome("Mikatral");
		mikatral.setAxeFighting(92);
		mikatral.setShielding(88);
		mikatral.setExperienciaTotal(20347845);
		mikatral.setLevel(161);
		return mikatral;
	}

}
