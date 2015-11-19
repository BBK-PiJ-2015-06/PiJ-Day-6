public class ArrayCopier {
	public void copy(int[] src, int[] dst) {
		int srcSize = src.length;
		int dstSize = dst.length;
		if(dstSize <= srcSize) {
			for(int index = 0; index < dstSize; index++) {
				dst[index] = src[index];
			}
		} else {
			for(int index = 0; index < srcSize; index++) {
				dst[index] = src[index];
			}
			for(int index = srcSize; index < dstSize; index++) {
				dst[index] = 0;
			}
		}
	}
}