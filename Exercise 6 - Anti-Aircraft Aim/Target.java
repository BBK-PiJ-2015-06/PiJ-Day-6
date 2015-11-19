public class Target {
	
	private int[][][] matrix;
	private int xTarget;
	private int yTarget;
	private int zTarget;
	
	public Target(int size) {
		this.matrix = new int[size][size][size];
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				for(int k = 0; k < size; k++) {
					this.matrix[i][j][k] = 0;
				}
			}
		}
		this.xTarget = 0;
		this.yTarget = 0;
		this.zTarget = 0;
	}
	public void init() {
		int size = this.matrix.length;
		Target reset = new Target(size);
		this.matrix[(int) Math.abs(size * Math.random())][(int) Math.abs(size * Math.random())][(int) Math.abs(size * Math.random())] = 1;
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				for(int k = 0; k < size; k++) {
					if(this.matrix[i][j][k] == 1) {
						this.xTarget = i;
						this.yTarget = j;
						this.zTarget = k;
					}
				}
			}
		}
	}
	public Result fire(int x, int y, int z) {
		int size = this.matrix.length;
		if((x < 0 || x >= size) || (y < 0 || y >= size) || (z < 0 || z >= size)) {
			return Result.OUT_OF_RANGE;
		} else {
			if(z < this.zTarget) {
				return Result.FAIL_HIGH;
			} else if(z > this.zTarget) {
				return Result.FAIL_LOW;
			} else {
				if(x < this.xTarget) {
					return Result.FAIL_RIGHT;
				} else if(x > this.xTarget) {
					return Result.FAIL_LEFT;
				} else {
					if(y < this.yTarget) {
						return Result.FAIL_LONG;
					} else if(y > this.yTarget) {
						return Result.FAIL_SHORT;
					} else {
						return Result.HIT;
					}
				}
			}
		}
	}
}