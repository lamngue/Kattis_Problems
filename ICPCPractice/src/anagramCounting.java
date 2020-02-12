import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class anagramCounting {

	public static HashMap<String, Integer> stringMap(String str) {
		HashMap<String, Integer> map = new HashMap();
		// make a hashmap of character and its occurence
		String[] strArr = str.split("");
		for (int i = 0; i < strArr.length; i++) {
			if (map.get(strArr[i]) != null) {
				int val = map.get(strArr[i]);
				map.put(strArr[i], val + 1);
			} else {
				map.put(strArr[i], 1);
			}
		}
		return map;
	}

	public static BigInteger getFactorial(int num) {
	    BigInteger fact = BigInteger.valueOf(1);
	    for (int i = 1; i <= num; i++)
	        fact = fact.multiply(BigInteger.valueOf(i));
	    return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String in = scan.next();
			BigInteger denominator = new BigInteger("1");
			Map<String, Integer> map = stringMap(in);
			BigInteger numerator = getFactorial(in.length());
			for (Entry<String, Integer> entry : map.entrySet()) {
			    denominator = denominator.multiply(getFactorial(entry.getValue()));
			}
			System.out.println(numerator.divide(denominator));
		}
	}
}
