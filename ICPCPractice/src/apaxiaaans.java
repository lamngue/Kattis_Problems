import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class apaxiaaans {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		String returnStr = "";
		boolean cont = true;
		returnStr += name.charAt(0);
		for(int i = 1;i< name.length(); i++) {
			if(name.charAt(i) == name.charAt(i-1)) {
				continue;
			}
			returnStr += name.charAt(i);
		}
		System.out.println(returnStr);
	}
}
