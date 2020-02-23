import java.util.Scanner;

public class Autori {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        String[] arr = name.split("-");
        for(int i = 0; i<arr.length;i++) {
        	System.out.print(arr[i].charAt(0));
        }
    }
}