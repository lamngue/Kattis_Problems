import java.util.Scanner;

public class kaleidoscopicPalindromes {

	public static boolean checkPalindrome(String number) {
		int start = 0;
		int end = number.length() - 1;
		while (start < end) {
			if (number.charAt(start) != number.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

	public static char reVal(int num) {
		if (num >= 0 && num <= 9)
			return (char) (num + 48);
		else
			return (char) (num - 10 + 65);
	}

	public static String convert(int num, int base) {
		String res = "";
		while (num > 0) {
			res += reVal(num % base);
			num /= base;
		}
		String ret = new StringBuilder(res).reverse().toString();
		return ret;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int k = scan.nextInt();
		int ret = 0;
		// for loop checking between number
		for (int i = a; i <= b; i++) {
			// check between bases
			boolean cont = true;
			for (int j = 2; j <= k && cont; j++) {
				String number = convert(i, j);
				if(!checkPalindrome(number)) {
					cont = false;
				}
			}
			if (cont) {
				ret++;
			}
		}
		System.out.println(ret);
	}
}
