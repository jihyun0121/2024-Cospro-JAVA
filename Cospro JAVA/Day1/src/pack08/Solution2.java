package pack08;

/*========================================================
  1차 8번    다른 코드 제안
  ========================================================*/
import java.util.*;

class Solution2 {
    boolean solution(String sentence){
        String str = "";
        for(int i = 0; i < sentence.length(); i++){   
            char c = sentence.charAt(i);
            if(c != ' ' && c != '.') str += c;
        }
        int left = 0;
        int right = str.length() - 1;
        while ( left < right){
            if(str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    // The following is main method to output testcase. The main method is correct and you shall correct solution method.
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        String sentence1 = "never odd or even.";
        boolean ret1 = sol.solution(sentence1);
        
        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret1 + " .");
        
        
        String sentence2 = "palindrome";
        boolean ret2 = sol.solution(sentence2);
        
        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret2+ " .");       
    }
}