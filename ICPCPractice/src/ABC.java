import java.util.Scanner;
public class ABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		//get max and min nums
		int max = Math.max(num1, Math.max(num2, num3));
		int min = Math.min(num1, Math.min(num2, num3));
		int mid = 0;
		if(min == num1 && max == num3) {
			mid = num2;
		}
		else if(min == num1 && max == num2) {
			mid = num3;
		}
		else if(min == num2 && max == num3) {
			mid = num1;
		}
		else if(min == num2 && max == num1) {
			mid = num3;
		}
		else if(min == num3 && max == num2) {
			mid = num1;
		}
		else if(min == num3 && max == num1) {
			mid = num2;
		}
		String order = scan.next();
		for(int i = 0; i<order.length();i++) {
			if(order.charAt(i) == 'A') {
				System.out.print(min + " ");
			}
			else if(order.charAt(i) == 'B') {
				System.out.print(mid + " ");
			}
			else {
				System.out.print(max + " ");
			}
		}
	}

}
