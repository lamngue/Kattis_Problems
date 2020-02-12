import java.util.Arrays;
import java.util.Scanner;

public class pivot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int[] nums = new int[n];
		int[] maxes = new int[n];
		int[] mins = new int[n];
		
		for (int i = 0; i < n; i++) {
			  nums[i] = scan.nextInt();
		}
		int max = nums[0];
		int min = nums[n - 1];
		
		
		for(int i = 0; i<n;i++) {
			//get max from left
			if(nums[i] > max) {
				max = nums[i];
			}
			//get min from right
			if(nums[n-i-1] < min) {
				min = nums[n-i-1];
			}
			maxes[i] = max;
			mins[n-i-1] = min;
		}
		int count = 0;
		for(int i = 0; i<n;i++) {
			if(nums[i] >= maxes[i] && nums[i] <= mins[i]) {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
