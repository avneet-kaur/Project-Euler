public class p009_Special_pythagorean_Triplet {
	public static void main(String[] args) {
		for (int a = 1; a <= 1000 / 3; a++) {
			for (int b = a + 1; b < 1000 / 2; b++) {
				int c = 1000 - a - b;
				if ((a * a + b * b == c * c) && (a + b + c == 1000)) {
					System.out.println(a * b * c);
					break;
				}
			}
		}
	}
}
