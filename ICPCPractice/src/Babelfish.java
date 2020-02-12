import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Babelfish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<>(); 
		while(scan.hasNext()) {
			String in = scan.nextLine();
			if(in.isBlank())
        		break;
        	String[] splitStrs = in.split(" ");
        	map.put(splitStrs[1], splitStrs[0]);
      	}
		while(scan.hasNext()) {
			String word = scan.next();
			if(map.containsKey(word)) {
				System.out.println(map.get(word));
			}else {
				System.out.println("Eh");
			}
		}
	}

}
