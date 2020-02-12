import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class HawaiiPizza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();

		// populate pizza info
		for (int ni = 0; ni < testCases; ni++) {
			int numberOfPizza = scan.nextInt();
			HashMap<String, String> foreignPizza = new HashMap<String, String>();
			HashMap<String, String> nativePizza = new HashMap<String, String>();
			List<String> foreignIngredients = new ArrayList<String>();
			List<String> nativeIngredients = new ArrayList<String>();
			for (int i = 0; i < numberOfPizza; i++) {
				String pizza = scan.next();
				int numberOfIngredients = scan.nextInt();
				for (int j = 0; j < numberOfIngredients; j++) {
					//remove duplicate ingredients
					String ing = scan.next();
					if(!foreignIngredients.contains(ing)) {
						foreignIngredients.add(ing);
					}
					//get the pizza with that ingredient
					String ret = foreignPizza.get(ing);
					if(ret == null) ret = "";
					foreignPizza.put(ing, ret + pizza);
				}
				int numnberOfIngredients2 = scan.nextInt();
				for (int k = 0; k < numnberOfIngredients2; k++) {
					String ing = scan.next();
					if(!nativeIngredients.contains(ing)) {
						nativeIngredients.add(ing);
					}
					//get the pizza with that ingredient
					String ret = nativePizza.get(ing);
					if(ret == null) ret = "";
					nativePizza.put(ing, ret + pizza);
				}
				
			}
			Collections.sort(foreignIngredients);
			Collections.sort(nativeIngredients);

			//loop thru the ingredients and check for matches
			for(int i = 0; i<foreignIngredients.size();i++) {
				for(int j = 0; j<nativeIngredients.size();j++) {
					if(foreignPizza.get(foreignIngredients.get(i)).equals(nativePizza.get(nativeIngredients.get(j)))){
						System.out.println("(" + foreignIngredients.get(i) +", " + nativeIngredients.get(j)+")");
					}
				}
			}
			System.out.println();
			
		}// end outer loop
		
	}
}
