import java.util.ArrayList;
import java.util.Scanner;


public class ReversedBinaryNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int in = scan.nextInt();
		int total = 0;
		ArrayList<Integer> original = new ArrayList<Integer>();
		ArrayList<Integer> reversed = new ArrayList<Integer>();
		while(in > 0) {
			
			reversed.add(in%2);
			in = in/2;
		}
		for(int i = reversed.size()-1; i>=0;i--) {
			original.add(reversed.get(i));
		}
		for(int i = 0; i < original.size();i++) {
			if(original.get(i).equals(1)) {
				total += Math.pow(2, i);
			}
		}
		System.out.println(total);
	}

}
