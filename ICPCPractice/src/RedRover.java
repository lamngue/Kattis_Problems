import java.util.Scanner;

public class RedRover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		int len = input.length();
		for(int i = 0; i < input.length();i++) {
			for(int j = i+1; j< input.length();j++) {
				String sub = input.substring(i, j);
				String replaced = input.replace(sub, "M");
				len = Math.min(len, sub.length()+replaced.length());
			}
		}
		System.out.println(len);
	}
}
