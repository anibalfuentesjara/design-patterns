package visitor;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FileSystemTest {

	private FileSystem emptyFs, fs;
	private Directory d1;
	private Directory d2;

	@Before
	public void setUp() {
		emptyFs = new FileSystem();

		d1 = new Directory("d1");
		d2 = new Directory("d2");
		d1.add(d2);
		d1.add(new TextFile("file.txt", "hello world!"));

		byte[] c = { '1', 'c' };
		d1.add(new BinaryFile("file.txt", c));

		fs = new FileSystem();
		fs.add(d1);
	}

	@Test
	public void testGetSize() {
		assertEquals(0, emptyFs.getSize());
		assertEquals(14, fs.getSize());
	}

	@Test
	public void testNumberOfFilesAndDirectories() {
		assertEquals(2, fs.getNumberOfFiles());
		assertEquals(2, fs.getNumberOfDirectories());
	}

}
