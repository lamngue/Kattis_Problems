import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Akcija {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int finalPrice = 0;
		ArrayList<Integer> prices = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			int price = scan.nextInt();
			prices.add(price);
		}
		// sort the prices
		Collections.sort(prices, Collections.reverseOrder());
		for(int i = 0; i<prices.size();i++) {
			if(i % 3 != 2) {
				finalPrice += prices.get(i);
			}
		}
		System.out.println(finalPrice);
	}
}
