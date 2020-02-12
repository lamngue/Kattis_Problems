import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Shopaholic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long finalPrice = 0;
        Long[] prices = new Long[n];
        for(int i = 0; i<n;i++) {
        	prices[i] = scan.nextLong();
        }
		Arrays.sort(prices, Collections.reverseOrder());
		for(int i = 0; i<n;i++) {
			if(i % 3 == 2) {
				finalPrice += prices[i];
			}
		}
		System.out.println(finalPrice);
	}

}
