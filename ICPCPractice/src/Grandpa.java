import java.util.Scanner;

public class Grandpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		char[][] grid = new char[size][size];
		
		//populate grid
		for(int i = 0; i < size; i++) {
			String str = scan.next();
			for(int j = 0; j < size; j++) {
				grid[i][j] = str.charAt(j);
			}
		}

		int numberWhiteRow = 0;
		int numberWhiteCol = 0;
		int row = 0;
		int col = 0;
		//check row
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				if(grid[i][j] == 'W') {
					numberWhiteRow++;
				}
			}
			if(numberWhiteRow == size/2) {
				row++;
				numberWhiteRow = 0;
			}
		}
		
		//check column
		for(int j = 0; j < size; j++) {
			for(int i = 0; i< size;i++) {
				if(grid[i][j] == 'W') {
					numberWhiteCol++;
				}
			}
			if(numberWhiteCol == size/2) {
				col++;
				numberWhiteCol = 0;
			}
		}
		
		//check no row has 3 or more consecutive squares
		
		for(int i = 0; i< size;i++) {
			for(int j = i+2; j<size-1;j++) {
				if(grid[i][j] == grid[i][j-1] && grid[i][j-1] == grid[i][j-2]) {
					System.out.println("0");
					return;
				}
			}
		}
		
		//check no column has 3 or more consecutive squares

		for(int j = 0; j<size;j++) {
			for(int i = j+2; i< size-1;i++) {
				if(grid[i][j] == grid[i-1][j] && grid[i-1][j] == grid[i-2][j]) {
					System.out.println("0");
					return;
				}
			}
		}
		
		if(row == size && col == size) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
	}

}
