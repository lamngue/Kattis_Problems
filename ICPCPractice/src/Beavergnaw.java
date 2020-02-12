import java.util.Scanner;

public class Beavergnaw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			int D = scan.nextInt();
			int V = scan.nextInt();
			if( D == 0 && V == 0) {
				return;
			}
			System.out.println(Math.cbrt(D*D*D - 6*V/Math.PI));
		}
	}

}
