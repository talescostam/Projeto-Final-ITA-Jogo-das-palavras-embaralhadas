import static org.junit.Assert.*;

import org.junit.Test;

import embaralhadores.EmbaralharPalindromo;
import embaralhadores.EmbaralharTotalmente;

public class testes {

	@Test
	public void testEmbaralharPalindromo() {
		EmbaralharPalindromo e = new EmbaralharPalindromo();
		assertEquals("selat", e.embaralhar("tales"));
	}

	@Test
	public void testEmbaralharTotalmente() {
		EmbaralharTotalmente e = new EmbaralharTotalmente();
		assertNotEquals("tales", e.embaralhar("tales"));
	}
	
}
