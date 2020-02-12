import java.util.ArrayList;
import java.util.Scanner;

public class PigLatin {
	public static ArrayList<String> vowel = new ArrayList<String>();

	public static int indexVowel(String str) {
		for(int i = 0;i<str.length();i++) {
			if(vowel.contains(Character.toString(str.charAt(i)))) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		vowel.add("a");
		vowel.add("i");
		vowel.add("u");
		vowel.add("e");
		vowel.add("o");
		vowel.add("y");
		while(scan.hasNextLine()) {
			String input = scan.nextLine();
			String[] arr = input.split(" ");
			for(int i = 0; i<arr.length;i++) {
				if(vowel.contains(Character.toString(arr[i].charAt(0)))) {
					arr[i] = arr[i] + "yay";
				}
				else {
					arr[i] = arr[i].substring(indexVowel(arr[i])) + arr[i].substring(0, indexVowel(arr[i])) + "ay";
				}
			}
			String output = String.join(" ", arr);
			System.out.println(output);
		}
	}

}
