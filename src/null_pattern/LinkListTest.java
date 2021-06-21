package null_pattern;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class LinkListTest {

	private ILinkList l;

	@Before
	public void setUp() throws Exception {
		l = new LinkList();
	}

	@Test
	public void testDefault() {
		assertTrue(l.isEmpty());
		assertEquals(0, l.size());
	}

	@Test
	public void adding() {
		l.addFirst(42);
		l.addFirst("Happy World");
		assertEquals(2, l.size());
		assertTrue(l.includes("Happy World"));
		assertTrue(l.includes(42));
		assertFalse(l.includes(43));
	}

	@Test
	public void otherOperations() {
		l.addFirst(14);
		l.addFirst("Hello!");
		l.addLast(15);
		assertEquals(3, l.size());
		assertEquals(0, l.indexOf("Hello!"));
		assertEquals(1, l.indexOf(14));
		assertEquals(2, l.indexOf(15));
		assertEquals(-1, l.indexOf(999));
	}

}
