public Matrix {
	private int[][] array2d;

	public Matrix(int size1, int size2) {
		this.array2d = new int[size1][size2]; 
	}
	
	public void setElement(int posX, int posY, int value) {
		int columns = this.array2d.length;
		int rows = this.array2d[0].length;
		if((posX < columns) && (posY < rows)) {
			this.array2d[posX][posY] = value;	
		}
	}
	
	public void setRow(int row, String input) {
		int rowLength = this.array2d.length;
		int rowPos = this.array2d[0].length;
		int[] row = new int[rowLength];
		String number = "";
		String temp = "";
		int count = 0;
		if(row < rowPos) {
			for(int i = 0; i < input.length(); i++) {
				temp = input.substring(i, i+1);
				char c = temp.charAt(0);
				if(c.isDigit(c)) {
					number = number.concat(temp);
				}
			else if (temp.equals(",")) {
				c 		
			}
			}
		}
	}
}