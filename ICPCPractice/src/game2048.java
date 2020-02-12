import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class game2048 {

	 public static void pushZerosToEnd(Integer[] matrix) { 
		 int count = 0;  
	     // neu array[i] khac 0 thi thay bang 0
	     for (int i = 0; i < matrix.length; i++) 
	    	 if (matrix[i] != 0) 
	             matrix[count++] = matrix[i]; 
	        // chuyen tat ca 0s ve cuoi
	        while (count < matrix.length) 
	            matrix[count++] = 0; 
	} 
	 
	public static void pushZeroesToBeg(Integer[] matrix) {
		int source = matrix.length - 1;
		int dest = matrix.length - 1;
		while (source >= 0) {
			if (matrix[source] != 0) {
				matrix[dest--] = matrix[source];
			}
				source--;
		}
		while (dest >= 0) {
			matrix[dest--] = 0;
		}
	}
	
	public static int countZero(Integer[] matrix) {
		int count = 0;
		for(int i = 0; i<matrix.length;i++) {
			if(matrix[i].equals(0))
				count++;
		}
		return count;
	}
	 
	public static void game() {
		Scanner scanner = new Scanner(System.in);
		Integer[][] matrix = new Integer[4][4];
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				int val = scanner.nextInt();
				matrix[i][j] = val;
			}
		}
		int direction = scanner.nextInt();
		if(direction == 0) {
			for(int i = 0; i < matrix.length; i++) {
				//loop tung column
				for(int j = 0; j < matrix.length;j++) {
					//loop kiem tra tung phan tu trong array
					for(int k = j+1; k < matrix.length; k++) {
						//neu 2 so canh nhau bang nhau
						if(matrix[i][j].equals(matrix[i][k]) && k == j+1) {
 							matrix[i][j] += matrix[i][k];
							matrix[i][k] = 0;
							pushZerosToEnd(matrix[i]);
						}
						//neu 2 so o xa nhau bang nhau va giua chung co so 0
						else if(matrix[i][j].equals(matrix[i][k]) && 
								((matrix[i][k-1].equals(0) && matrix[i][k-2].equals(0)) || (matrix[i][k-1].equals(0)))) {
							matrix[i][j] += matrix[i][k];
							matrix[i][k] = 0;
						}
					}
				}
			}
		}
		//up
		else if(direction == 1) {
			boolean[][] combine = {{false, false, false, false}, {false, false, false, false}, {false, false, false, false}, {false, false, false, false}};
			for(int i = 0; i < matrix.length; i++) {
				//loop tung column
				for(int j = 0; j < matrix.length;j++) {
					//combine same values
					if(i > 0 && matrix[i-1][j].equals(matrix[i][j]) && !combine[i-1][j]) {
						matrix[i-1][j] += matrix[i][j];
						matrix[i][j] = 0;
						combine[i-1][j] = false;
					}
					//push zeroes to the end
					if(matrix[i][j].equals(0)) {
						for(int ni=i+1; ni< matrix.length;ni++){
			            	if (matrix[ni][j] != 0) {      
			            		int temp = matrix[i][j]; 
			            	    matrix[i][j] = matrix[ni][j]; 
			            	    matrix[ni][j] = temp; 
			            		break;
			            	}
			              }
					}
				}
			}
		}
		//right
		else if(direction == 2) {
			boolean[][] combine = {{false, false, false, false}, {false, false, false, false}, {false, false, false, false}, {false, false, false, false}};
			for(int i = 0; i < matrix.length; i++) {
				if(countZero(matrix[i]) > 0) {
					pushZeroesToBeg(matrix[i]);
				}
				for(int j = 0; j< matrix.length; j++) {	//combine same values
					if(j > 0 && matrix[i][j].equals(matrix[i][j-1]) && !combine[i][j-1]) {
						matrix[i][j] += matrix[i][j-1];
						matrix[i][j-1] = 0;
						combine[i][j-1] = false;
					}
				}
				
			}
		}
		//down 
		else if(direction == 3) {
			boolean[][] combine = {{false, false, false, false}, {false, false, false, false}, {false, false, false, false}, {false, false, false, false}};
			
		}
		System.out.println(Arrays.deepToString(matrix));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		game();
	}

}
