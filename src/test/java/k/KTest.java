package k;

import org.junit.Test;

public class KTest {

	@Test
	public void test() {
		K k = new K();
		k.compileFromFile("k/program.k");
		k.run();
	}
	
}
