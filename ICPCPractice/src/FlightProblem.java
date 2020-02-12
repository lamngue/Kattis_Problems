
public class FlightProblem {
	public static int[] dpFindingMinimizer(int[][] costs) {
		int[] minimizer = new int[costs.length];
		for(int i = 0;i<minimizer.length;i++) {
			minimizer[i] = 1000;
		}
		//flight from starting city to itself is 0;
		minimizer[0] = 0;
		for(int i = 1; i < costs.length ; i++) {
			for(int k = 0; k < i ; k++) {
				minimizer[i] = Math.min(minimizer[i], minimizer[k] + costs[k][i-1]);
			}
		}
		return minimizer;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int costs[][] = {{100,200,300,400,500,600}, {1000,50,100,150,200,300}, {1000,1000,60,100,115,240}, {1000,1000,1000,40,70,100}, {1000,1000,1000,1000,40,40}, {1000,1000,1000,1000,1000,20}};
		int[] mini = dpFindingMinimizer(costs);
		for(int i = 0; i <mini.length;i++) {
			System.out.println(mini[i]);
		}
	}

}
