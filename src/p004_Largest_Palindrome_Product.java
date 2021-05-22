
public class p004_Largest_Palindrome_Product {

	public static void main(String[] args) {
		int maximumPalindrome = 0;
		for (int i = 100; i <= 999; i++) {
			for (int j = 100; j <= 999; j++) {
				int product = i * j;
				if (ispalindrome(product) && product > maximumPalindrome) {
					maximumPalindrome = product;
				}
			}
		}
		System.out.println("Maximum palindrome is = " + maximumPalindrome);
	}

	public static boolean ispalindrome(int num) {
		int temp = num;
		int reversed = 0;
		while (temp != 0) {
			int last_digit = temp % 10;
			reversed = reversed * 10 + last_digit;
			temp /= 10;
		}
		if (reversed == num) {
			return true;
		}
		return false;
	}

}
