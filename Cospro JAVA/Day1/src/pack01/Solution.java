package pack01;

/*========================================================
  1차 1번    1차 2급 1_initial_code.java
  ========================================================*/
// You may use import as below.
import java.util.*;

class Solution {
    public int[] solution(String[] shirtSize) {
        // Write code here.
        int[] answer = new int[6];
        int temp;
        
        for (String i : shirtSize) {
			if (i.equals("XS"))
				answer[0]++;
			else if (i.equals("S"))
				answer[1]++;
			else if (i.equals("M"))
				answer[2]++;
			else if (i.equals("L"))
				answer[3]++;
			else if (i.equals("XL"))
				answer[4]++;
			else if (i.equals("XXL"))
				answer[5]++;
		}
        
        //sort
//        for(int i = 0; i < answer.length; i++) {
//        	for(int j = i+1; j < answer.length; j++) {
//        		if (answer[j] < answer[i]) {
//		        	temp = answer[i];
//		        	answer[i] = answer[j];
//		        	answer[j] = temp;
//				}
//        	}
//        }
        
        return answer;
    }
    
    // The following is main method to output test case.
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] shirtSize = {"XS", "S", "L", "L", "XL", "S"};
        int[] ret = sol.solution(shirtSize);
 
        // Press Run button to receive output.  
        System.out.println("Solution: return value of the method is " + Arrays.toString(ret) + " .");
    }
}