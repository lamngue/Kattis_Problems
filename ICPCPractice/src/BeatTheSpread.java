import java.util.ArrayList;
import java.util.Scanner;


public class BeatTheSpread {

	public static ArrayList<Integer> findX(int total, int diff) {
		int x = 0;
		int y = x-diff;
		if(x - diff < 0) {
			y = x+diff;
		}
		ArrayList<Integer> ret = new ArrayList<Integer>();
		while(x + y < total) {
			x++;
			y++;
		}
		if(x+y>total) {
			return ret;
		}
		if(x > y) {
			ret.add(x);
			ret.add(y);
		}
		else {
			ret.add(y);
			ret.add(x);
		}
		return ret;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		for(int i = 0; i< testCases;i++) {
			int total = scan.nextInt();
			int diff = scan.nextInt();
			ArrayList<Integer> res = findX(total, diff);
			if(res.size() == 0) {
				System.out.println("impossible");
			}
			else {
				System.out.println(res.get(0) + " " + res.get(1));
			}
		}
	}

}
