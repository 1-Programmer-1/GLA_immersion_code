public class Maximum_no_of_jumpsQ5 {
   
    public static void main(String[] args) {
        int arr[]={1, 4, 3, 2, 6, 7};
        int n = 11;
        System.out.println(jump(arr,n));

    }
    



  public static int jump(int[] nums,int n) {

    int totalJumps = 0;

    
    int destination = n- 1;

    int coverage = 0, lastJumpIdx = 0;

   
    if (nums.length == 1) return 0;

  
    for (int i = 0; i < n; i++) {

      coverage = Math.max(coverage, i + nums[i]);

      if (i == lastJumpIdx) {
        lastJumpIdx = coverage;
        totalJumps++;

        
        if (coverage >= destination) {
          return totalJumps;
        }
      }
    }

    return totalJumps;
  }

}

       
    

