import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DRMMessages {
	public static char[] characters = {
			'A','B','C','D','E','F','G','H',
			'I','J','K','L','M','N','O','P',
			'Q','R','S','T','U','V','W','X',
			'Y','Z'
	};

	public static int getRotationVal(String str) {
		int total = 0;
		//get rotation value
		for(int i = 0;i<str.length();i++) {
			total += new String(characters).indexOf(str.charAt(i));
		}
		while(total >= 26) {
			total = total - 26;
		}
		return total;
	}
	
	public static String rotate(String str, int val) {
		String res = "";
		if(val >= 26) val -= 26;
		for(int i = 0; i < str.length(); i++) {
			int current = new String(characters).indexOf(str.charAt(i));
			if(current + val >= 26) {
				current = current - 26;
			}
			res += new String(characters).charAt(current + val);
		}
		return res;
	}
	
	public static String merge(String str1, String str2) {
		String res = "";
		for(int i = 0; i< str1.length(); i++) {
			int current = getRotationVal(Character.toString(str2.charAt(i)));
			res += rotate(Character.toString(str1.charAt(i)),current);
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		int mid = input.length()/2;
		String part1 = input.substring(0,mid);
		String part2 = input.substring(mid);
		System.out.println(merge(rotate(part1, getRotationVal(part1)), rotate(part2, getRotationVal(part2))));
	}

}
