package projectEuler;

import java.util.ArrayList;
import java.util.Scanner;

/*
 *project1
 *If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 *The sum of these multiples is 23.
 *Find the sum of all the multiples of 3 or 5 below 1000.
 *
 */
public class Multiples {
	
	ArrayList result = new ArrayList(); ;
	int total;
	
	Multiples(){
	}
	
	public int findMultipleThreeAndFive(int n){
		int count = 0;
		for(int i = 0 ; i < n; i++){
			
			if(i%3 == 0 || i%5 ==0){
				System.out.println("Count: " + count);
				System.out.println("i: " +i);
				result.add(i);
				count++;
			}
			
		}
		return n;	
	}
	
	public int sum(){
		for(int j = 0; j< result.size();j++){
			total += (int) result.get(j);
		}
		System.out.println("Sum of these multiples: "+ total);
		return total;	
	}
	
	public void check(){
		for(int k = 0; k < result.size();k++){
			System.out.println(result.get(k));
		}
	}
	
	/**
	 * For testing purpose
	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Please enter a number: ");
//		int number = sc.nextInt();
//		Multiples test = new Multiples();
//		test.findMultipleThreeAndFive(number);
//		test.sum();
//	}
	
}
