package pack05;

/*========================================================
  1차 5번    다른 코드 제안
  ========================================================*/
import java.util.*;

class Solution2 {
    public int[] solution(int[] arr) {
        
        for (int i=0; i < arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        int[] arr = {1, 4, 2, 3};
        int[] ret = sol.solution(arr);
 
        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + Arrays.toString(ret) + " .");
    }
}