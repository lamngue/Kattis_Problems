import java.util.Scanner;

public class pizzaCrust {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int R = scan.nextInt();
		int C = scan.nextInt();
		System.out.println((Math.pow(R-C,2)/Math.pow(R, 2)) * 100);
	}	

}
