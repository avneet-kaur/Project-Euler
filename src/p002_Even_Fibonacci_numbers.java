
public class p002_Even_Fibonacci_numbers {

	public static void main(String[] args) {
		int first = 1;
		int second = 2;
		int sum = 0;
		while (sum <= 4000000) {
			if (first % 2 == 0)
				sum += first;
			int next = first + second;
			first = second;
			second = next;
		}
		System.out.println(sum);

	}

}
