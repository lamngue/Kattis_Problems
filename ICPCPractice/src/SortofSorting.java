import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortofSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			if (n == 0) {
				break;
			}
			ArrayList<String> data = new ArrayList<String>();
			for (int i = 0; i < n; i++) {
				String name = scan.next();
				data.add(name);
			}
			Collections.sort(data, new Comparator<String>() {

				@Override
				public int compare(String o1, String o2) {
					// TODO Auto-generated method stub
					return o1.substring(0, 2).compareTo(o2.substring(0,2));
				}

			});
			for(int i = 0; i<data.size();i++) {
				System.out.println(data.get(i));
			}
			System.out.println();
		}

	}

}
