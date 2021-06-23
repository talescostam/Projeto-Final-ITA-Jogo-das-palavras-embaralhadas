package embaralhadores;

public class EmbaralharPalindromo implements Embaralhador {
	
	@Override
	public String embaralhar(String palavra) {
		String palavraInvertida = "";
		for (int i = palavra.length() - 1; 0 <= i; i--) {
			palavraInvertida += palavra.charAt(i);
		}
		return palavraInvertida;
	}

}
