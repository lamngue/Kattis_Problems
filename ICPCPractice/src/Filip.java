import java.util.Scanner;

public class Filip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int reverse1 = 0, reverse2 = 0;
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		while(num1 != 0) { reverse1 = reverse1 * 10; reverse1 = reverse1 + num1%10; num1 = num1/10; }
		while(num2 != 0) { reverse2 = reverse2 * 10; reverse2 = reverse2 + num2%10; num2 = num2/10; }
		System.out.println(reverse1 > reverse2 ? reverse1 : reverse2);
	}

}
