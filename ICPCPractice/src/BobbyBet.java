import java.util.Scanner;

public class BobbyBet {

	public static int choose(int n, int k) {
		int[][] table = new int[n+1][k+1];
		for(int i = 0; i <= n; i++) {
			for(int j = 0; j<= Math.min(i, k); j++){
				if(j == 0 || j == i) {
					table[i][j] = 1;
				}
				else {
					table[i][j] = table[i-1][j-1] + table[i-1][j];
				}
			}
		}
		return table[n][k];
	}
	
	//calculate probability that A occurs 
	//at least x times in y trials
	
	public static double prob(int x, int y, int s, double p) {
		double probability = 0.0;
		double q = 1.0 - p;
		for(int i = x; i<=y;i++) {
			probability += choose(y, i) * Math.pow(p, i) * Math.pow(q, y-i);
		}
		return probability;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i = 0;
		while(i < n) {
			int r = scan.nextInt();
			int s = scan.nextInt();
			int x = scan.nextInt();
			int y = scan.nextInt();
			int w = scan.nextInt();
			double probab = 0;
			double p = (double)(s - r + 1)/s;
			// calculate probability got 
			// at least r at least x in y trials
			probab += prob(x, y, s, p);
			
			//calculate expected return 
			double expectReturn = probab * w;
			if(expectReturn <= 1) {
				System.out.println("no");
				i++;
			}
			else {
				System.out.println("yes");
				i++;
			}
		}
	}
}
