import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class APrizeNoOneCanWin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int prices = scan.nextInt();
		ArrayList<Integer> items = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			items.add(scan.nextInt());
		}
		Collections.sort(items);
		int no = 0;
		int price = 0;
		int i = 0; 
		int j = 1;
		while(i < items.size() && j < items.size()) {
			price = items.get(i) + items.get(j);
			if(price > prices)
				break;
			i++;
			j++;
		}
		System.out.println(j);
	}

}
