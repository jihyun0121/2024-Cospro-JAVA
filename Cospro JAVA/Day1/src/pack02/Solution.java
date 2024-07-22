package pack02;

/*========================================================
  1차 2번    1차 2급 2_initial_code.java
  ========================================================*/
// You may use import as below.
import java.util.*;

class Solution {
    public int solution(int price, String grade) {
        // Write code here.
        int answer = 0;
        
        if (grade.equals("S"))
        	answer = (int)(price * 0.95);	//실수를 정수로 형변환
        else if (grade.equals("G"))
        	answer = (int)(price * 0.9);	//실수를 정수로 형변환
        else if (grade.equals("V"))
        	answer = (int)(price * 0.85);	//실수를 정수로 형변환
        
        
        return answer;
    }    

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int price1 = 2500;
        String grade1 = new String("V");
        int ret1 = sol.solution(price1, grade1);
        
        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret1 + " .");
        
        int price2 = 96900;
        String grade2 = new String("S");
        int ret2 = sol.solution(price2, grade2);
        
        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret2 + " .");
    }
}