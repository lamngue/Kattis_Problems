import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class Dreamer {

	public static boolean checkLeap(int year) {
		if (year % 4 != 0) {
			return false;
		}
		if (year % 400 == 0 || (year % 100 == 0 && year % 400 != 0) || (year % 4 == 0 && year % 100 != 0)) {
			return true;
		}
		return false;
	}

	public static boolean checkValidDate(String date) {
		String dateFormat = "dd-MM-yyyy";
		DateFormat df = new SimpleDateFormat(dateFormat);
		df.setLenient(false);
		try {
			df.parse(date);
			return true;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int numCases = scan.nextInt();
		for (int i = 0; i < numCases; i++) {
			String day = scan.next();
			String month = scan.next();
			String year = scan.next();
			String date = day + "-" + month + "-" + year;
			if(checkValidDate(date)) {
				
			}
		}
	}

}
