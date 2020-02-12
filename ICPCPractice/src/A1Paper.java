import java.util.ArrayList;
import java.util.Scanner;

public class A1Paper {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        double totalCost = 0.0;
        long n = scan.nextLong();
        long sheets = 1;
        boolean enough = false;
        long[] papers = new long[ (int) (n-1)];
        for(int i = 0; i< n -1;i++) {
        	papers[i] = scan.nextInt();
        	
        }
        //A2 paper
        double longEdge = Math.pow(2.0, -3/4.0);
        double shortEdge = Math.pow(2.0, -5/4.0);
        //Keeps track of how many sheets of the current size that must be created.
        double temp;
        for(int i = 0; i< n-1;i++) {
        	//Add the length of tape needed for this to
        	//a running total.
        	totalCost += longEdge * sheets;
        	
       
        	//This is twice the number needed at
        	//previous size minus the number of sheets
        	//we have of this size.
        	sheets = sheets * 2 - papers[i];
        	
        	if(sheets <= 0) {
        		System.out.printf("%.11f\n", totalCost);
            	return;
        	}
        	
        	//move to the next paper size, because the shorter edge is 
        	//the long edge of smaller size and short edge is half the long edge, so we swap the values
        	temp = shortEdge;
        	shortEdge = longEdge;
        	longEdge = temp;
        	
        	shortEdge = shortEdge/2;
        	
        	
        }
        System.out.println("impossible");
	}

}
