import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ACMContestScoring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// problem solved and trials
		HashMap<String, Integer> problems = new HashMap<String, Integer>();
		int totalTime = 0;
		int penalty = 0;
		int correct = 0;
		while (scan.hasNext()) {
			int time = scan.nextInt();
			if(time == -1) {
				break;
			}
			String prob = scan.next();
			String res = scan.next();
			if (res.equals("right")) {
				if(problems.containsKey(prob)) {
					penalty += problems.get(prob);
				}
				totalTime += time;
				correct++;
			}
			else {
				if(problems.containsKey(prob)) {
					problems.put(prob, problems.get(prob) + 20);
				}
				else {
					problems.put(prob, 20);
				}
			}
		}
		int total = totalTime + penalty;
		System.out.println(correct + " " + total);
	}

}
