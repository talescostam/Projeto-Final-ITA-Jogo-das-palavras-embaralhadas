package embaralhadores;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FabricaEmbaralhadores {

	private static List<Embaralhador> e = new ArrayList<>();

	static {
		e.add(new EmbaralharPalindromo());
		e.add(new EmbaralharTotalmente());
	}

	public static Embaralhador getRandom() {
		Random random = new Random(System.currentTimeMillis());
		int referencia = random.nextInt();
		int indice = referencia % e.size();

		return e.get(Math.abs(indice));
	}
}