package exceptions;

/**
 * example of aborting a recursion using a try catch block
 */
public class Matrix3D {

	private int[][][] table;

	Matrix3D() {
		int[] line0 = { 0, 0, 0 };
		int[] line1 = { 1, 0, 0 };
		int[][] mat1 = new int[][] { line0, line0, line0 };
		int[][] mat2 = new int[][] { line1, line0, line0 };
		int[][] mat3 = new int[][] { line0, line1, line0 };
		table = new int[][][] { mat1, mat2, mat3 };
	}

	public static void main(String[] args) {
		Matrix3D m = new Matrix3D();
		System.out.println(m.numberOf2DMatricesWith(1));
	}

	private int numberOf2DMatricesWith(int value) {
		int nbOfMatching = 0;
		for (int z = 0; z < table.length; z++) {
			try {
				for (int y = 0; y < table[z].length; y++) {
					for (int x = 0; x < table[z][y].length; x++) {
						if (table[z][y][x] == value) {
							System.out.println("z=" + z);
							throw new Throwable();
						}
					}
				}
			} catch (Throwable e) {
				nbOfMatching++;
			}
		}
		return nbOfMatching;
	}

}
