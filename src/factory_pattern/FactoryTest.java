package factory_pattern;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FactoryTest {

	@Test
	public void test() {
		Lara lara = new Lara();
		lara.shellFactory(new RiffleFactory());
		assertEquals(lara.fire().getClass(), RiffleShell.class);
	}

}
