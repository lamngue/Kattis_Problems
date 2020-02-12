import java.math.BigInteger;
import java.util.Scanner;

public class EulersNumbers {

	public static BigInteger getFactorial(int num) {
	    BigInteger fact = BigInteger.valueOf(1);
	    for (int i = 1; i <= num; i++)
	        fact = fact.multiply(BigInteger.valueOf(i));
	    return fact;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		if(input >= 16) {
			System.out.println(Math.E);
		}
		else {
			double output = 0;
			for(int i = 0; i<= input;i++) {
				double sub = 1/getFactorial(i).doubleValue();
				output += sub;
			}
			System.out.println(output);
		}
		
	}
}
