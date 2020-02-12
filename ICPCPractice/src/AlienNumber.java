import java.util.Arrays;
import java.util.Scanner;

public class AlienNumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int testCase = scan.nextInt();
		for(int i = 1; i<= testCase; i++) {
			String alien_number = scan.next();
			String source_language = scan.next();
			String target_language = scan.next();
			int baseSource = source_language.length();
			int baseTarget = target_language.length();
			int base10 = 0;
			String returnString = "";
			String[] arr = alien_number.split("");
			String[] arr1 = source_language.split("");
			int exp = 0;
			//convert from baseSource to base 10
			for(int j = arr.length-1; j>=0;j--) {
				base10 += Arrays.asList(arr1).indexOf(arr[j]) * Math.pow(baseSource, exp);
				exp++;
			}
			//convert from base 10 to baseTarget
			while(base10 > 0) {
				int rem = base10 % baseTarget;
		        returnString += target_language.split("")[rem];
		        base10 /= baseTarget;
			}
		String res = new StringBuilder(returnString).reverse().toString();
		System.out.println("Case #" + i+ ": "+ res);
		}
	}
}
