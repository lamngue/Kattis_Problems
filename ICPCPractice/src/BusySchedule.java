import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BusySchedule {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			if (n == 0) {
				break;
			}
			// convert input to minutes
			ArrayList<Integer> data = new ArrayList<Integer>();
			for (int i = 0; i <= n; i++) {
				int d = 0;
				String in = scan.nextLine();
				if(!in.isEmpty()) {
					String z = in.split(" ")[1];
					String h = in.split(" ")[0].split(":")[0];
					String m = in.split(" ")[0].split(":")[1];
					if (z.equals("p.m.")) {
						d = 12 * 60;
					}
					if (Integer.parseInt(h) != 12 && z.equals("a.m.") || Integer.parseInt(h) != 12 && z.equals("p.m.")) {
						d += Integer.parseInt(h) * 60;
					}
					d += Integer.parseInt(m);
					data.add(d);
				}
				
			}
			Collections.sort(data);
			for(int i = 0; i<data.size();i++) {
				int h = data.get(i) / 60;
				int m = data.get(i) % 60;
				String z = data.get(i) < 720 ? "a.m." : "p.m.";
				if(h == 0) h = 12;
				if(h > 12) h -= 12;
				String mins = ""+m;
				if(m < 10) mins = "0" + m;
				System.out.println(h+":"+mins + " " +z);
			}
			System.out.println();
		}
		

	}
}
