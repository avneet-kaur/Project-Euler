public class p003_largest_prime_factor {

	public static void main(String[] args) {

		long n = 600851475143L;
		while (n % 2 == 0) {
			n /= 2;
		}
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			while (n % i == 0) {
				n = n / i;
			}
		}
		System.out.println(n);
	}
}
