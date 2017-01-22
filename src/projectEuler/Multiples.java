package projectEuler;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
     List<Integer> list = new ArrayList<Integer>();
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        Solution s = new Solution();
        for(int a0 = 0; a0 < t; a0++){
           int n = in.nextInt();
           s.list = s.findMultipleThreeAndFive(n);
           s.sum();
            
        }
    }
    
    public List<Integer> findMultipleThreeAndFive(int n){
        List<Integer> result = new ArrayList<Integer>();
		int count = 0;
		for(int i = 0 ; i < n; i++){
			
			if(i%3 == 0 || i%5 ==0){
				result.add(i);
				count++;
			}
			
		}
        
        return result;
       
	}
    
    public void sum(){
        int total = 0;
        for(int j = 0; j< list.size();j++){
			total += (int) list.get(j);
		}
		System.out.println(total);	
    }
}
