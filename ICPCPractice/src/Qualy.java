import java.util.Scanner;

public class Qualy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Integer period = scan.nextInt();
		float qualy = 0;
		for(int i = 0; i< period; i++) {
			float quality = scan.nextFloat();
			float periodTime = scan.nextFloat();
			qualy += quality * periodTime;
		}
		System.out.printf("%.3f", qualy);
	}

}
