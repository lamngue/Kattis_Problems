import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SecureDoors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
        Set<String> hash_Set = new HashSet<String>(); 
        for(int i = 0; i<= n;i++) {
        	String in = scan.nextLine();
        	String[] splitStrs = in.split(" ");
        	if(splitStrs[0].equals("entry")) {
        		if(!hash_Set.contains(splitStrs[1])) {
        			hash_Set.add(splitStrs[1]);
        			System.out.println(splitStrs[1] + " entered");
        		}
        		else {
        			System.out.println(splitStrs[1] + " entered (ANOMALY)");
        		}
        	}
        	else if(splitStrs[0].equals("exit")) {
        		if(hash_Set.contains(splitStrs[1])) {
        			hash_Set.remove(splitStrs[1]);
        			System.out.println(splitStrs[1] + " exited");
        		}
        		else {
        			System.out.println(splitStrs[1] + " exited (ANOMALY)");
        		}
        	}
        }
	}

}
