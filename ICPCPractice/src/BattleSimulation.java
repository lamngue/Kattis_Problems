import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BattleSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String monster = scan.next();
		StringBuilder str = new StringBuilder("");
		HashMap<String, String> counters = new HashMap<String, String>();
		counters.put("R", "S");
		counters.put("C", "C");
		counters.put("B", "K");
		counters.put("L", "H");
		int i = 0;
		while (i < monster.length()) {
			if (i < monster.length() - 2 && (monster.charAt(i + 2) != monster.charAt(i + 1) && monster.charAt(i + 1) != monster.charAt(i)
					&& monster.charAt(i + 2) != monster.charAt(i))) {
				str.append("C");
				i+=3;
			} else {
				str.append(counters.get(Character.toString(monster.charAt(i))));
				i++;
			}
		}
		System.out.println(str.toString());
	}

}
