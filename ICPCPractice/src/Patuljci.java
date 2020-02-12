import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet; 

public class Patuljci {
    
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    ArrayList<Integer> number = new ArrayList<Integer>();
	    int total = 100;
	    int sum = 0;
	    for(int i = 0; i<9;i++) {
	    	int n = scan.nextInt();
	    	number.add(n);
	    	sum += n;
	    }
	    int remove1 = 0;
	    int remove2 = 0;
	    //find 2 elements that add up to target and remove from list
	    for(int i = 0; i< number.size();i++) {
	    	for(int j = i+1;j<number.size();j++) {
	    		if(sum-number.get(i)-number.get(j) == total) {
	    			remove1 = i;
	    			remove2 = j;
	    		}
	    	}
	    }
	    number.remove(remove1);  
	    number.remove(remove2);
	    //print results
	    for(int i = 0; i<number.size();i++) {
	    	System.out.println(number.get(i));
	    }
	}
}