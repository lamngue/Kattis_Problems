import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TextureAnalysis {

	public static boolean isAllEqual(ArrayList<Integer> a) {
		for (int i = 1; i < a.size(); i++) {
			if (a.get(0) != a.get(i)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int lines = 0;
		while (scan.hasNext()) {
			String in = scan.nextLine();
			if (in.equals("END")) {
				break;
			}
			lines++;
			int white = 0;
			int black = 0;
			Set<Integer> b = new HashSet<Integer>();
			for(int i = 0 ; i<in.length();i++) {
				if(in.charAt(i) == '.')
					white++;
				else {
					if(black > 0)
						b.add(white);
					black++;
					white = 0;
				}
			}
			if(b.size() <=1) {
				System.out.println(lines + " EVEN");
			}
			else {
				System.out.println(lines + " NOT EVEN");
			}
//			if(in.length() == 0) {
//				System.out.println(lines + " NOT EVEN");
//				continue;
//			}
//			String[] in2 = in.split("\\*");
//			// if there's no white pixel
//			if (in2.length == 0) {
//				System.out.println(lines + " EVEN");
//			} else {
//				int whitePix = 0;
//				//counts the number of white pixels between each black pair
//				ArrayList<Integer> numberOfWhite = new ArrayList<Integer>();
//				for (int i = 1; i < in2.length; i++) {
//					for (int j = 0; j < in2[i].length(); j++) {
//						whitePix++;
//					}
//					if (whitePix == 0)
//						continue;
//					else {
//						numberOfWhite.add(whitePix);
//						whitePix = 0;
//					}
//				}
//				// if there's only one group of whitePixels between two black
//				if (numberOfWhite.size() == 1) {
//					// if the first two or last two characters are the same
//					if (Character.toString(in.charAt(in.length() - 2)).equals("*")
//							|| Character.toString(in.charAt(1)).equals("*")) {
//						System.out.println(lines + " NOT EVEN");
//					} else {
//						System.out.println(lines + " EVEN");
//					}
//				}
//				else {
//					// check if there is any adjacent * in string
//					boolean flag = false;
//					for (int i = 0; i < in.length(); i++) {
//						if (i + 1 < in.length() && Character.toString(in.charAt(i)).equals("*")
//								&& Character.toString(in.charAt(i + 1)).equals("*")) {
//							System.out.println(lines + " NOT EVEN");
//							flag = true;
//							break;
//						}
//					}
//					if (isAllEqual(numberOfWhite) && !flag) {
//						System.out.println(lines + " EVEN");
//					} else if (!flag) {
//						System.out.println(lines + " NOT EVEN");
//					}
//				}
//
//			}
		}
	}
}
