import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class incognito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int testCase = scan.nextInt();
		for (int i = 0; i < testCase; i++) {
			int attr = scan.nextInt();
			String category = "";
			ArrayList<String> cat1 = new ArrayList<String>();
			Map<String, Integer> equipments = new HashMap<String, Integer>();
			for (int j = 0; j < attr; j++) {
				scan.next();
				category = scan.next();
				cat1.add(category);
				if (equipments.containsKey(category)) {
					int occurence = equipments.get(category);
					equipments.put(category, occurence + 1);
				} else {
					equipments.put(category, 1);
				}
			}
			int permute = 1;
			ArrayList<Integer> l = new ArrayList<Integer>(equipments.values());
			Set<String> s = new HashSet<String>(cat1);

			
				// if all attributes are distinct
				if (s.size() == cat1.size()) {
					permute = (int) (Math.pow(2, attr) - 1);
					System.out.println(permute);
				} else {
					if(s.size() == 1) {
						System.out.println(attr);
					}
					else {
						//if there are duplicate attributes, get all the distinct subsets
						for (Entry<String, Integer> entry : equipments.entrySet()) {
							permute = permute * (entry.getValue() + 1);
						}
						System.out.println(permute - 1);
					}
					
				}			
		}
	}

}
