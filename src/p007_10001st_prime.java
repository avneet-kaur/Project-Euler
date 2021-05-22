
public class p007_10001st_prime {

	public static void main(String[] args) {
		int n = 2000000;
		boolean[] isPrime = new boolean[n + 1];
		for (int i = 3; i < n; i += 2) {
			isPrime[i] = true;
		}
		isPrime[2] = true;
		isPrime[0] = isPrime[1] = false;

		for (int factor = 2; factor * factor <= n; factor++) {
			if (isPrime[factor]) {
				for (int j = 2; factor * j <= n; j++) {
					isPrime[factor * j] = false;
				}
			}
		}

		// count Prime Numbers
		int count = 0;
		int ans = 0;
		int sum = 0;
		for (int k = 2; k <= n; k++) {
			if (isPrime[k]) {
				count++;
				if (count == 10001) {
					ans = k;
					sum += k;
					break;
				}
			}
		}
		System.out.println(ans);
		System.out.println(sum);

	}

}
