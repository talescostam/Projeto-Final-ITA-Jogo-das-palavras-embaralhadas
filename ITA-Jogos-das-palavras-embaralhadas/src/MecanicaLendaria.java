import embaralhadores.Embaralhador;
import embaralhadores.FabricaEmbaralhadores;

public class MecanicaLendaria implements MecanicaDoJogo{

	private int vida;
	private int pontos;
	String palavra;
	String proximaPalavraAleatoria;
	
	BancoDePalavras bdp = new BancoDePalavras();
	FabricaEmbaralhadores fe = new FabricaEmbaralhadores();
	
	public MecanicaLendaria() {
		this.vida = 1;
		this.pontos = 0;
		novaPalavraAleatoria();
		setProximaPalavraAleatoria();
	}
	
	@Override
	public boolean verificaPalavra(String palavra) {
		if(palavra.equals(getPalavraAleatoria()))
			return true;
		return false;
	}

	@Override
	public int getVida() {
		return this.vida;
	}

	@Override
	public void perdeuUmaVida() {
		this.vida--;
	}

	@Override
	public void acertou(int n) {
		this.pontos += n*2;
	}

	@Override
	public int getPontos() {
		return this.pontos;
	}

	@Override
	public void setProximaPalavraAleatoria() {
		Embaralhador e = FabricaEmbaralhadores.getRandom();
		this.proximaPalavraAleatoria = e.embaralhar(getPalavraAleatoria());
	}

	@Override
	public String getPalavraAleatoria() {
		return this.palavra;
	}

	@Override
	public void novaPalavraAleatoria() {
		this.palavra = bdp.selecionaPalavraAleatoria();
		setProximaPalavraAleatoria();
	}

	@Override
	public String getProximaPalavraAleatoria() {
		return this.proximaPalavraAleatoria;
	}

}
