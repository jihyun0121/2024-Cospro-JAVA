package ex01;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 문제2) "abcde" 문자배열을 거꾸로 출력하시오
///////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
class Solution2 {
	public String solution(String characters){
        String result = "";
         // here coding  
        for (int i = 0; i <= characters.length(); i++) {
        	result += characters.charAt(i);
			
		}

        
        return result;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        String characters = "abcde";
        String ret = sol.solution(characters);
        System.out.println("Solution: return value of the method is " + ret + " .");
    }
}