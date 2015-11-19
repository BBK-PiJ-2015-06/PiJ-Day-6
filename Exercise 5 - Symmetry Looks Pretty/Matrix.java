public class Matrix {
	
	private int[][] matrix;
	private int rowSize;
	private int columnSize;
	
	public Matrix(int rows, int columns) {
		matrix = new int[rows][columns];
		for(int x = 0; x < rows; x++) {
			for(int y = 0; y < columns; y++) {
				matrix[x][y] = 1;
			}
		}
		this.rowSize = rows;
		this.columnSize = columns;
	}
	public void setElement(int x, int y, int element) {
		if(x < this.rowSize && y < this.columnSize) {
			matrix[x][y] = element;
		}
	}
	public void setRow(int x, String elements) {
		String[] splitNumbers = elements.split(",");
		if(x < this.rowSize && splitNumbers.length == this.columnSize) {
			for(int y = 0; y < this.columnSize; y++) {
				matrix[x][y] = Integer.parseInt(splitNumbers[y]);
			}
		}
	}
	public void setColumn(int y, String elements) {
		String[] splitNumbers = elements.split(",");
		if(y < this.columnSize && splitNumbers.length == this.rowSize) {
			for(int x = 0; x < this.rowSize; x++) {
				matrix[x][y] = Integer.parseInt(splitNumbers[x]);
			}
		}
	}
	public String toString() {
		String output = "[";
		if(this.rowSize != 0 && this.columnSize != 0) {
			for(int x = 0; x < (this.rowSize - 1); x++) {
				for(int y = 0; y < (this.columnSize - 1); y++) {
					output += matrix[x][y] + ",";
				}
				output += matrix[x][this.columnSize - 1] + ";";
			}
			for(int y = 0; y < (this.columnSize - 1); y++) {
				output += matrix[this.rowSize - 1][y] + ",";	
			}
			output += matrix[this.rowSize - 1][this.columnSize - 1];
		}
		output += "]";
		return output;
	}
	public void prettyPrint() {
		for(int x = 0; x < this.rowSize; x++) {
			for(int y = 0; y < this.columnSize; y++) {
				System.out.print("" + '\t' + matrix[x][y]);
			}
			System.out.println("");
		}
	}
	public void setMatrix(String elements) {
		String[] splitRows = elements.split(";");
		if(splitRows.length == this.rowSize) {
			for(int x = 0; x < this.rowSize; x++) {
				String[] splitElements = splitRows[x].split(",");
				if(splitElements.length != this.columnSize) {
					System.out.println("Invalid input: column length does not match on line " + x);
					return;
				}
			}
			for(int x = 0; x < this.rowSize; x++) {
				String[] splitElements = splitRows[x].split(",");
				if(splitElements.length == this.columnSize) {
					for(int y = 0; y < this.columnSize; y++) {
						matrix[x][y] = Integer.parseInt(splitElements[y]);
					}
				}
			}
		} else {
			System.out.println("Invalid input: row length does not match");
		} 
	}
	public boolean isSymmetrical() {
		MatrixChecker test = new MatrixChecker();
		if(this.columnSize == 1) {
			int[] array = new int[this.rowSize];
			for (int i = 0; i < this.rowSize; i++) {
				array[i] = this.matrix[i][0];
			}
			return test.isSymmetrical(array);
		} else if(this.rowSize == 1) {
			int[] array = new int[this.columnSize];
			for (int j = 0; j < this.columnSize; j++) {
				array[j] = this.matrix[0][j];
			}
			return test.isSymmetrical(array);
		} else {
			return test.isSymmetrical(this.matrix);
		}
	}
	public boolean isTriangular() {
		MatrixChecker test = new MatrixChecker();
		return test.isTriangular(this.matrix);
	}
}