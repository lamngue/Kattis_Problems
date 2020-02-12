import java.util.Scanner;
import java.math.BigInteger;

public class threePowers {

	public static String binaryform(BigInteger num1) {

		String bin = "";
		while (num1.compareTo(BigInteger.valueOf(0)) == 1) {

			bin += (num1.mod(BigInteger.valueOf(2)));
			num1 = num1.divide(BigInteger.valueOf(2));

		}
		return bin;
	}

	public static int countOne(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '1') {
				count++;
			}
		}
		return count;
	}
	
	public static BigInteger pow(int base, int power) {
		BigInteger res = new BigInteger("1");
		for(int i = 1; i<=power;i++) {
			res = res.multiply(BigInteger.valueOf(base));
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String next = scan.next();
			BigInteger val = new BigInteger(next);
			if(val.equals(BigInteger.valueOf(0))) {
				break;
			}
			
			BigInteger num1 = val.subtract(BigInteger.valueOf(1));
			String str = "";
			String bin = binaryform(num1);
			str += ("{ ");
			if (countOne(bin) == 1) {
				int power = bin.indexOf("1");
				BigInteger val1 = pow(3, power);
				str += (val1.toString());
				str += (" }");
				System.out.println(str);
			} else {
				for (int i = 0; i < bin.length(); i++) {
					if (bin.charAt(i) == '1') {
						int power = i;
						BigInteger val1 = pow(3, power);
						str += (val1.toString() + ", ");
					}
				}
				str = str.toString().replaceAll(", $", "");
				str += (" }");
				System.out.println(str);
			}

		}
	}
}
