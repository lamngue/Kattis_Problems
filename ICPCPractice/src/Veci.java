import java.util.Scanner;

public class Veci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Integer in = scan.nextInt();
		String[] num = in.toString().split("");
		int[] nums = new int[num.length];
		for(int i = 0; i<num.length;i++) {
			nums[i] = Integer.parseInt(num[i]);
		}
	}

}
