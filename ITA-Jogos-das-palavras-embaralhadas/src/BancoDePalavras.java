import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class BancoDePalavras {

	static private ArrayList<String> palavras = new ArrayList<String>();

	public BancoDePalavras() {
		try {
			FileReader reader = new FileReader("dados.txt");
			BufferedReader leitor = new BufferedReader(reader);
			String linha = leitor.readLine();

			while (linha != null) {
				palavras.add(linha);
				linha = leitor.readLine();
			}
			reader.close();
		} catch (IOException e) {
			System.err.println("Erro ao tentar abrir o arquivo: " + e.getMessage());
		}
	}

	public String selecionaPalavraAleatoria() {
		Random r = new Random();
		int n = r.nextInt(palavras.size());
		return palavras.get(n);
	}

}
