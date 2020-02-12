import java.util.ArrayList;
import java.util.Scanner;

public class polymul1 {

	public static int mul(int[] p1, int[] p2, int t) {
		int s = 0;
		for(int i = 0; i <= t; i++) {
			s += p1[i] * p2[t-i];
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i = 0; i < t; i++) {
			int deg1 = scan.nextInt();
			int[] pol1 = new int[1000];
			int[] pol2 = new int[1000];
			for(int j = 0; j <= deg1; j++) {
				int in = scan.nextInt();
				pol1[j] = in;
			}
			int deg2 = scan.nextInt();
			for(int k = 0; k <= deg2; k++) {
				int in = scan.nextInt();
				pol2[k] = in;
			}
			int total = deg1 + deg2;
			System.out.println(total);
			System.out.print(mul(pol1, pol2, 0) + " ");
			for(int l = 1; l <= total; l++) {
				System.out.print(mul(pol1, pol2, l) + " ");
			}
			System.out.println();
		}
	}

}
