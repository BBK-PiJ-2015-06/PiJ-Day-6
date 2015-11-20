public class MatrixChecker {
	public boolean isSymmetrical(int[] array) {
		boolean output = true;
		for(int i = 0; i < (array.length / 2); i++) {
			if(array[i] != array[array.length - i]) {
				output = false;
			}
		}
		return output;
	}
	public boolean isSymmetrical(int[][] array) {
		boolean output = true;
		if (array.length != array[0].length) {
			output = false;
		} else {
			for(int i = 0; i < array.length; i++) {
				for(int j = 0; j < array[0].length; j++) {
					if(array[i][j] != array[j][i]) {
						output = false;
					}
				}
			} 
		}
		return output;
	}
	public boolean isTriangular(int[][] array) {
		boolean output = true;
		for(int i = 1; i < array.length; i++) {
			for(int j = 0; j < i; j++) {
				if(array[i][j] != 0) {
					output = false;
				}
			}
		}
		return output;
	}
}