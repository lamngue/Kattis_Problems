import java.util.HashMap;
import java.util.Scanner;

public class aNewAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("a", "@");
		map.put("b", "8");
		map.put("c", "(");
		map.put("d", "|)");
		map.put("e", "3");
		map.put("f", "#");
		map.put("g", "6");
		map.put("h", "[-]");
		map.put("i", "|");
		map.put("j", "_|");
		map.put("k", "|<");
		map.put("l", "1");
		map.put("m", "[]\\/[]");
		map.put("n", "[]\\[]");
		map.put("o", "0");
		map.put("p", "|D");
		map.put("q", "(,)");
		map.put("r", "|Z");
		map.put("s", "$");
		map.put("t", "']['");
		map.put("u", "|_|");
		map.put("v", "\\/");
		map.put("w", "\\/\\/");
		map.put("x", "}{");
		map.put("y", "`/");
		map.put("z", "2");
		Scanner scan = new Scanner(System.in);
		String input = "";
		input = scan.nextLine();
		
		input = input.toLowerCase();
		String res = "";
		for(int i = 0; i < input.length();i++) {
			int val = (int) input.charAt(i);
			if(val >= 97 && val <= 122) {
				res += map.get(Character.toString(input.charAt(i)));
			}
			else {
				res += Character.toString(input.charAt(i));
			}
		}
		System.out.println(res);
	};

}
