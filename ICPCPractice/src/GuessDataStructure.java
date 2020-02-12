import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class GuessDataStructure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			int n = scan.nextInt();
			Stack<Integer> stack = new Stack<Integer>();
			Queue<Integer> queue = new LinkedList<Integer>();
			PriorityQueue<Integer> pq = new PriorityQueue<Integer>(n, Collections.reverseOrder());
			boolean isStack = true;
			boolean isQueue = true;
			boolean isPQ = true;
			for(int i = 0; i<n;i++) {
				int op = scan.nextInt();
				if(op == 1) {
					int e = scan.nextInt();
					stack.push(e);
					queue.add(e);
					pq.add(e);
				}
				else {
					int e = scan.nextInt();
					if(isStack) {
						if(stack.isEmpty()) isStack = false;
						else {
							if(stack.peek() != e) isStack = false;
							stack.pop();
						}
					}
					if(isQueue) {
						if(queue.isEmpty()) isQueue = false;
						else {
							if(queue.peek() != e) isQueue = false;
							queue.poll();
						}
					}
					if(isPQ) {
						if(pq.isEmpty()) isPQ = false;
						else {
							if(pq.peek() != e) isPQ = false;
							pq.poll();
						}
					}
				}
			}
			if(!isStack && !isQueue && !isPQ) {
				System.out.println("impossible");
			}
			else if(isStack && !isQueue && !isPQ) {
				System.out.println("stack");
			}
			else if(!isStack && isQueue && !isPQ) {
				System.out.println("queue");
			}
			else if(!isStack && !isQueue && isPQ) {
				System.out.println("priority queue");
			}
			else {
				System.out.println("not sure");
			}
		}
	}

}
