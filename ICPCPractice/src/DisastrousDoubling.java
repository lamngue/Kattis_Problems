import java.util.Scanner;
import java.math.BigInteger;

public class DisastrousDoubling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int numHours = scan.nextInt();
		BigInteger bac = new BigInteger("1");
		for(int i = 1; i <= numHours; i++) {
			bac = bac.multiply(new BigInteger("2"));
			bac = bac.subtract(new BigInteger(scan.next()));
			if(bac.compareTo(new BigInteger("0")) == -1) {
				System.out.println("error");
				return;
			}
		}
		System.out.println(bac.mod(new BigInteger("1000000007")));
	}

}
