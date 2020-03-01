import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class StackingCups {

	public static boolean isStringInt(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (NumberFormatException ex) {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] s = new String[2];
		ArrayList<Integer> rads = new ArrayList<Integer>();
		HashMap<Integer, String> rad = new HashMap<Integer, String>();
		scan.nextLine();
		for (int i = 0; i < n; i++) {
			String in = scan.nextLine();
			s = in.split(" ");
			if(in.equals("")) {
				break;
			}
			if(isStringInt(s[0])) {
				rads.add(Integer.parseInt(s[0])/2);
				rad.put(Integer.parseInt(s[0])/2, s[1]);
			}else {
				rads.add(Integer.parseInt(s[1]));
				rad.put(Integer.parseInt(s[1]),s[0]);
			}
		}
		scan.close();
		Collections.sort(rads);
		for (int i = 0; i < n; i++) {
			System.out.println(rad.get(rads.get(i)));
		}
	}
}
