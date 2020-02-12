import java.util.Scanner;

public class janitortroubles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		//quadrilateral is maximum area when its vertices form a circle
		double perimeter = (double)(a+b+c+d)/2;
		double area = Math.sqrt((double)(perimeter-a)*(double)(perimeter-b)*(double)(perimeter-c)*(double)(perimeter-d));
		System.out.println(area);
	} 

}
