import java.util.Scanner;

public class KitchenMeasurements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(n == 2) {
			int c1 = scan.nextInt();
			int c2 = scan.nextInt();
			int target = scan.nextInt();
			if(c1 - c2 == target) {
				System.out.println(c2);
				return;
			}
			else {
				System.out.println("impossible");
				return;
			}
		}
		for(int i = 0; i< n - 1;i++) {
			
		}
	}

}
