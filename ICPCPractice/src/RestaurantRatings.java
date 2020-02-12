import java.util.Scanner;

public class RestaurantRatings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextLine()) {
			int n = scan.nextInt();
			int s = 0;
			for(int i = 0; i<n; i++) {
				s += scan.nextInt();
			}
			int[][] table = new int[n+1][s+1];
			
			// base case 
			for(int i = 0; i<= n;i++) {
				table[i][0] = 1;
			}
			table[1][s] = s + 1;
			System.out.println(table[n][s]);
		}
	}

}
