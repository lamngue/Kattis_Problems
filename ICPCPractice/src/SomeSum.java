import java.util.Scanner;

public class SomeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		if (input == 1) {
			System.out.println("Either");
			return;
		}
		String output = "";
		if(input % 4 == 2) {
			output = "Odd";
		}
		else if(input % 2 == 0) {
			output = "Even";
		}
		else {
			output = "Either";
		}

		System.out.println(output);
	}
}
