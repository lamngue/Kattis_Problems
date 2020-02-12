import java.util.ArrayList;
import java.util.Arrays;

public class LongestNonDecreasingSubsequence {

	public static int problem(int[] sequence) {
		int[] length = new int[sequence.length];
		int max = 0;
		Arrays.fill(length,1);
		for(int j = 1; j< sequence.length;j++) {
			for(int i = 0; i < j; i++) {
				if(sequence[j] >= sequence[i]) {
					length[j] = Math.max(length[j], length[i] + 1);
				}
			}
			max = Math.max(length[j], max);
		}
		return max;
	}
	public static ArrayList<Integer> longestNonDecSub(int[] sequence) {
		ArrayList<Integer> longest = new ArrayList<Integer>();
		for(int j = 1; j< sequence.length;j++) {
			for(int i = 0; i < j; i++) {
				if(sequence[j] > sequence[i] && j == sequence.length - 1) {
					longest.add(sequence[i]);
				}
			}
		}
		if(longest.get(longest.size() - 1) <= sequence[sequence.length - 1]) {
			longest.add(sequence[sequence.length - 1]);
		}
		return longest;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] args1 = {-1,3,4,5,2,2,2,2};
		int res = problem(args1);
		System.out.println("Length of longest non-decreasing subsequence is: " + res);
		ArrayList<Integer> seq = longestNonDecSub(args1);
		System.out.println(seq);
	}

}
