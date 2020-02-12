import java.util.Scanner;

public class aaah {

	public static int countA(String saying) {
		int count = 0;
		for(int i = 0; i<saying.length(); i++) {
			if(saying.charAt(i) == 'a') {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String you = scan.next();
		String doctor = scan.next();
		int youA = countA(you);
		int doctorA = countA(doctor);
		if(youA < doctorA) {
			System.out.println("no");
		}
		else {
			System.out.println("go");
		}
	}

}
