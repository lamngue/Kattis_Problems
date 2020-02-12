import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Fourthought {
	private static HashMap<Integer, String> map = new HashMap<Integer, String>();
	private int[] operator = new int[] { 1, 2, 3, 4 };
	
	public static void generate() {
		Random ran = new Random();
		ArrayList<String> eqs = new ArrayList<String>();
		// generate 64 possible equations
		while(true) {
			String op1 = null, op2 = null, op3 = null;
			int x = ran.nextInt(4);
			int y = ran.nextInt(4);
			int z = ran.nextInt(4);
			if(x == 0) op1 = "+";
			if(y == 0) op2 = "+";
			if(z == 0) op3 = "+";
			if(x == 1) op1 = "-";
			if(y == 1) op2 = "-";
			if(z == 1) op3 = "-";
			if(x == 2) op1 = "*";
			if(y == 2) op2 = "*";
			if(z == 2) op3 = "*";
			if(x == 3) op1 = "/";
			if(y == 3) op2 = "/";
			if(z == 3) op3 = "/";
			String equation = "4" + op1 + "4" + op2 + "4" + op3 + "4";
			if(!eqs.contains(equation)) {
				eqs.add(equation);
			}
			if(eqs.size() == 64) break;
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
//		int m = scan.nextInt();
//		for (int i = 0; i < m; i++) {
//			int x = scan.nextInt();
//
//			System.out.println("no solution");
//
//		}
		generate();
	}

}
