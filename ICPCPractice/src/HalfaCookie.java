import java.util.Scanner;

public class HalfaCookie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextLine()) {
			String in = scan.nextLine();
			double r = Double.parseDouble(in.split(" ")[0]);
			double x = Double.parseDouble(in.split(" ")[1]);
			double y = Double.parseDouble(in.split(" ")[2]);
			double dis = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
			if(dis > r) {
				System.out.println("miss");
			}else {
				double area = Math.pow(r, 2) * Math.PI;
				double chord = (Math.sqrt(Math.pow(r, 2) - Math.pow(dis, 2))) * 2;
				double omega = Math.acos((double)dis/r) * 2;
				double smallerArea = (omega - Math.sin(omega)) * Math.pow(r, 2)/2;
				double biggerArea = area - smallerArea;
				System.out.println(biggerArea + " " + smallerArea);
			}
		}
	}

}
