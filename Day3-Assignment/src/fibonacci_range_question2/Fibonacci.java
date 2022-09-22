package fibonacci_range_question2;

public class Fibonacci {

	int startRange;
	int endRange;

	public Fibonacci(int startRange, int endRange) {
		this.startRange = startRange;
		this.endRange = endRange;
	}

	public void printBetweenRange() {
		if (this.startRange <= 0 || this.endRange <= 0)
			System.out.println("ERROR!! Range should be positive natural number ..");
		else if (startRange > endRange)
			System.out.println("ERROR!! Start range should be less than end..");
		else {
			int count = 2;
			int first = 0, second = 1;
			if (startRange == 1)
				System.out.print(first + " ");
			while (count <= endRange) {
				if (startRange <= count)
					System.out.print(second + " ");
				int temp = first + second;
				first = second;
				second = temp;
				count++;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Fibonacci fib = new Fibonacci(1, 10);
		fib.printBetweenRange();
	}
}
