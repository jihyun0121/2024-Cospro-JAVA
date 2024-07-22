package pack04;

/*========================================================
  1차 4번    추가 제안 코드 
  ========================================================*/
class Solution2 {
	
	int maxCnt = 0;
    int minCnt = 1001;
    
    int[] func_a(int[] arr){
        int[] counter = new int[1001];
        for(int i = 0; i < arr.length; i++)
            counter[arr[i]]++;
        return counter;
    }
    
    void find_min_max(int[] arr) {
    	for(int e : arr) {
    		this.maxCnt = Math.max(e, this.maxCnt);
    		if (e != 0)
    		    this.minCnt = Math.min(e, this.minCnt);
    	}
    }
    
    public int solution(int[] arr) {
        int[] counter = func_a(arr);
        find_min_max(counter);
        return this.maxCnt / this.minCnt;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        int[] arr = {1, 2, 3, 3, 1, 3, 3, 2, 3, 2};
        int ret = sol.solution(arr);

        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret + " .");
    }
}