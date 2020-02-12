import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MountRushmore {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String m = scan.next();
		String n = scan.next();
		HashMap<String, String> translation = new HashMap<>();
		for(int i = 0; i< Integer.parseInt(m); i++) {
			String a = scan.next();
			String b = scan.next();
			translation.put(a, b);
		}
		print(translation);
	}
	
	public static void print(Map<String, String> map) { 
		if (map.isEmpty()) { 
	            System.out.println("map is empty"); 
	      } 
	  
	        else { 
	            System.out.println(map); 
	        } 
	} 

}
