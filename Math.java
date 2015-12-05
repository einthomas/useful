
public class Math {

	public static boolean isPowerOfTwo(int x) {
		return (x & (x - 1)) == 0;
	}
}
