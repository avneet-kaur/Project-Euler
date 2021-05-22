
public class p005_Smallest_Multiple {

	public static void main(String[] args) {
		int allLcm = 1;
		for (int i = 1; i <= 20; i++) {
			allLcm = lcm(i, allLcm);
		}
		System.out.println(allLcm);
	}

	public static int lcm(int a, int b) {
		int ans = (a * b) / gcd(a, b);
		System.out.println(ans);

		return (a / gcd(a, b)) * b;

	}

	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

}
