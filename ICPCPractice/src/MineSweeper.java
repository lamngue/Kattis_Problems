import java.util.Scanner;

public class MineSweeper {
	
	public static void mine() {
		int rows, cols;
		Scanner scanner = new Scanner(System.in);
		rows = scanner.nextInt();
		cols = scanner.nextInt();
		String[][] matrix = new String[rows][cols];
		int[][] output = new int[rows][cols];
		//initialize with 0s
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < rows; j++) {
				output[i][j] = 0;
			}
		}
		for(int y = 0; y < rows; y++) {
			for(int x = 0; x < cols; x++) {
				matrix[y][x] = scanner.nextLine();
				if(matrix[y][x] == "*") {
					//check rows
					//if mine y coordinate is bigger than 1
					if(y >= 1) {
						output[y - 1][x]++; //then increments its north
						if(x >= 1)
							output[y-1][x-1]++; //if the x coordinate is bigger or equal 1, then increments the mine's northwest
						if(x+1 < cols) 
							output[y-1][x+1]++; //if x is smaller than or equal to col, increments the mine's northeast
					}
						
					//if mine's y is smaller than or equal to rows:
					if(y + 1 < rows) {
						output[y+1][x]++; //then increments its south
						if(x >= 1) 
							output[y+1][x-1]++; //increment southwest
						if(x + 1 < cols) 
							output[y+1][x+1]++; //increment southeast
					}
						
					//increment west
					if(x >= 1) 
						output[y][x-1]++; 
				
					//increment east
					if(x + 1 < cols) 
						output[y][x+1]++;
				}
			}
		}
		
		//print the output
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				if(matrix[i][j] == "*") {
					System.out.println(matrix[i][j]);
				}
				else {
					System.out.println(output[i][j]);
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mine();
	}

}
