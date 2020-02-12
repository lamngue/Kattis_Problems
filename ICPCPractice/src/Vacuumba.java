import java.util.Scanner;

public class Vacuumba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 0; i < n;i++) {
			int segments = scan.nextInt();
			double x = 0.0;
			double y = 0.0;
			double d = 0.0;
			for(int j = 0; j < segments; j++) {
				double deg = Double.parseDouble(scan.next());
				double dis = Double.parseDouble(scan.next());
				d += deg;
				x += dis * Math.sin(Math.toRadians(-d));
				y += dis * Math.cos(Math.toRadians(-d));
			}
			System.out.println(x + " " + y);
		}
	}

}
