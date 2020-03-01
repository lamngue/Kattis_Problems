import java.util.Scanner;

public class Skener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int c = scan.nextInt();
		int ZR = scan.nextInt();
		int ZC = scan.nextInt();
		String[][] in = new String[r][c];
		for (int i = 0; i < r; i++) {
			String n = scan.next();
			for (int j = 0; j < c; j++) {
				String cha = Character.toString(n.charAt(j));
				in[i][j] = cha;
			}
		}
		for(int i = 0; i<r;i++) {
			for(int j = 0; j < ZR; j++) {
				for(int k = 0; k<c;k++) {
					for(int g = 0;g<ZC;g++) {
						System.out.print(in[i][k]);
					}
				}
				System.out.println();
			}
		}

	}

}
