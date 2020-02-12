import java.util.Scanner;

public class threeDPrintedStatues {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int statuesToPrint = scan.nextInt();
		int day = 0;
		int statuesPrinted = 0;
		int printers = 1;
		while(statuesPrinted < statuesToPrint) {
			//if there is shortage of printer
			if((statuesToPrint - statuesPrinted) > printers) {
				//print new printers
				printers += printers;
				day++;
			}
			//if there is enough printer
			else {
				statuesPrinted += printers;
				day++;
			}
		}
		System.out.println(day);
	}

}
