package pack01;

/*========================================================
  1차 1번    1차 2급 1_initial_code.java
  ========================================================*/
// You may use import as below.
import java.util.*;

class Solution2 {
    public int[] solution(String[] shirtSize) {
        // Write code here.
        int[] answer = new int[6];
        for (int i=0;i<shirtSize.length;i++) {
        	switch (shirtSize[i]) {
        	case "XS":
        		answer[0]++;
        		break;
        	case "S":
        		answer[1]++;
        		break;
        	case "M":
        		answer[2]++;
        		break;
        	case "L":
        		answer[3]++;
        		break;
        	case "XL":
        		answer[4]++;
        		break;
        	case "XXL":
        		answer[5]++;
        		break;
        	}
        }
        return answer;
    }
    
    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        String[] shirtSize = {"XS", "S", "L", "L", "XL", "S"};
        int[] ret = sol.solution(shirtSize);
 
        // Press Run button to receive output.  
        System.out.println("Solution: return value of the method is " + Arrays.toString(ret) + " .");
    }
}