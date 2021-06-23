package embaralhadores;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmbaralharTotalmente implements Embaralhador {

	@Override
	public String embaralhar(String palavra) {
		List<String> letras = Arrays.asList(palavra.split(""));
		Collections.shuffle(letras);
		StringBuilder b = new StringBuilder();
		for (String letra : letras) {
			b.append(letra);
		}
		if (b.toString().equals(palavra)) {
			return this.embaralhar(palavra);
		}
		return b.toString();
	}
}
