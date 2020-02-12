
public class ThreeNPlusOne {
	
	public static int findCycleLength(int n) {
		int count = 0;
		while(n != 1) {
			if(n % 2 != 0) {
				n = 3*n+1;
				count++;
			}
			else {
				n = n/2;
				count++;
			}
		}
		return count + 1;
	}
	public static int findMaxCycle(int a, int b) {
		int maxCycle = 0;
		for(var i = a; i<=b; i++) {
			int temp = findCycleLength(i);
			if(maxCycle < temp) {
				maxCycle = temp;
			}
		}
		return maxCycle;
	}

}
