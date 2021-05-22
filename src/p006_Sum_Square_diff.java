
public class p006_Sum_Square_diff {

	public static void main(String[] args) {
		int square = 0;
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			square += i * i;
			sum += i;
		}
		int squareOfSum = sum * sum;
		int difference = squareOfSum - square;
		System.out.println(Math.abs(difference));
	}
}
