import java.util.Scanner;

public class DiceGame {

	public static double calculateExpected(int n1, int n2) {
		double expected = 0;
		for (int i = n1; i <= n2; i++) {
			expected += i;
		}
		return expected / (n2 - n1 + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double expected1 = 0;
		double expected2 = 0;
		double expected3 = 0;
		double expected4 = 0;
		int a1 = scan.nextInt();
		int b1 = scan.nextInt();
		expected1 = calculateExpected(a1, b1);
		int a2 = scan.nextInt();
		int b2 = scan.nextInt();
		expected2 = calculateExpected(a2, b2);
		int a3 = scan.nextInt();
		int b3 = scan.nextInt();
		expected3 = calculateExpected(a3, b3);
		int a4 = scan.nextInt();
		int b4 = scan.nextInt();
		expected4 = calculateExpected(a4, b4);
		if (expected1 + expected2 < expected3 + expected4) {
			System.out.println("Emma");
		}
		else if (expected1 + expected2 > expected3 + expected4) {
			System.out.println("Gunnar");
		}
		else {
			System.out.println("Tie");
		}
	}

}
