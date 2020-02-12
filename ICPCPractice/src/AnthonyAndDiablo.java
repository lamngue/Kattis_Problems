import java.util.Scanner;

public class AnthonyAndDiablo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double area = scan.nextDouble();
		double peri = scan.nextDouble();
		double r = peri/(Math.PI * 2);
		double a = Math.PI * Math.pow(r, 2);
		if(area <= a) {
			System.out.println("Diablo is happy!");
		}
		else {
			System.out.println("Need more materials!");
		}
	}

}
