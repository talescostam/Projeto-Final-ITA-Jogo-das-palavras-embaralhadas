

public interface MecanicaDoJogo {

	abstract boolean verificaPalavra(String palavra);
	
	abstract int getVida();
	
	abstract void perdeuUmaVida();
	
	abstract void acertou(int n);
	
	abstract int getPontos();
	
	abstract void setProximaPalavraAleatoria();
	
	abstract String getPalavraAleatoria();
	
	abstract void novaPalavraAleatoria();
	
	abstract String getProximaPalavraAleatoria();

}
