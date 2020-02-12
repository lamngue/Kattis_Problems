import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MasteringMastermind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int len = Integer.parseInt(scan.next());
		String code = scan.next();
		String guess = scan.next();
		ArrayList<String> traversed = new ArrayList<String>();
		ArrayList<String> traversedCode = new ArrayList<String>();
		ArrayList<String> traversedGuess = new ArrayList<String>();
		int r = 0;
		int s = 0;
		for (int i = 0; i < len; i++) {
			if (code.charAt(i) == guess.charAt(i)) {
				r++;
			}
			else {
				traversedCode.add(Character.toString(code.charAt(i)));
				traversedGuess.add(Character.toString(guess.charAt(i)));
			}
		}
		for(int i = 0; i< traversedCode.size();i++) {
			for(int k = 0; k<traversedCode.size();k++) {
				String a = traversedCode.get(i);
				String b = traversedGuess.get(k);
				if(a.equals(b) && i!=k && (!traversed.contains(a))) {
					traversed.add(a);
					s++;
				}
			}
		}
		System.out.println(r + " " + s);
	}

}
