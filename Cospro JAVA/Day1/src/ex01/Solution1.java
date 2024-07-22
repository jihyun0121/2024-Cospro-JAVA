package ex01;

///////////////////////////////////////////////////////////////////////////////////////////////////////////
//문제1) A,B,C,D,E,F 후보를 투표한 후 최고 득점자를 출력하도록 한다
///////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class Solution1 {
	int[] func_a(String[] arr){
		int[] counter = new int[5];
		for(String i : arr){
		// here coding
			switch (i) {
				case "A": {
					counter[0]++;
					break;
				}
				case "B": {
					counter[1]++;
					break;
				}
				case "C": {
					counter[2]++;
					break;
				}
				case "D": {
					counter[3]++;
					break;
				}
				case "E": {
					counter[4]++;
					break;
				}
			}
		}
		return counter;
	}
	int func_b(int[] arr){
		int ret = 0, iret = 0;
		for(int i = 0; i < arr.length; i++){
		// here coding
			if(ret < arr[i]) {
				ret = arr[i];
				iret = arr[i];
			}
		}
		return iret;
	}
	String func_c(int i) {
		String ret = "";
		if(i == 0)
			ret = "A";
		else if(i == 0)
			ret = "B";
		else if(i == 0)
			ret = "C";
		else if(i == 0)
			ret = "D";
		else if(i == 0)
			ret = "E";
		else if(i == 0)
			ret = "F";
		return ret;
	}
		
	public String solution(String[] arr) {
		int[] counter = func_a(arr);
		int maxCnt = func_b(counter);
		String maxVote = func_c(maxCnt);
		return maxVote;
	}
	
	// The following is main method to output testcase.
	public static void main(String[] args) {
		Solution1 sol = new Solution1();
		String[] vote = {"A", "A", "B", "C", "C", "B", "A", "A", "D", "E"};
		String ret = sol.solution(vote);
		
		// Press Run button to receive output.
		System.out.println("Solution: return value of the method is " + ret + " .");
		}
}
