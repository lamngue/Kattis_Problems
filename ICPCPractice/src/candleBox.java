import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class candleBox {
	public static int findAge(int candle, int minus) {
		candle = candle + minus;
		candle = candle * 2;
		int age = 0;
		while(age*(age) + age < candle) {
			age++;
		}
		if(age * age + age == candle) {
			return age;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int D = scan.nextInt();
		int R = scan.nextInt();
		int T = scan.nextInt();
		int ritaAge = 0;
		int theoAge = 0;
		int candle = 0;
		//brute force to find the ages =))
		while(true) {
			ritaAge = findAge(R--, 6);
			theoAge = findAge(T++, 3);
			if(ritaAge-theoAge == D) break;
			candle++;
		}
		System.out.println(candle);
	}
}
