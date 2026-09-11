class Solution {
    int sum = 0;
    public boolean solve(int []arr,int i, int sum, int k){
        if(sum == k){
            return true;
        }
        if(i == arr.length){
            return false;
        }
        
        // add curr index to sum
       boolean take =  solve(arr,i+1,sum+arr[i],k);
        
        // skip
        boolean skip = solve(arr,i+1,sum,k);
        
        return take || skip;
    }
    public boolean checkSubsequenceSum(int[] arr, int k) {
        // code here
      return  solve(arr,0,sum,k);
    }
}

// With Memoization

class Solution {
   Boolean dp[][];
    public boolean solve(int []arr,int i, int sum, int k){
        if(sum == k){
            return true;
        }
        if(i == arr.length || sum > k){
            return false;
        }
        
        if (dp[i][sum] != null) {
                    return dp[i][sum];
                }

        // add curr index to sum
       boolean take =  solve(arr,i+1,sum+arr[i],k);
        
        // skip
        boolean skip = solve(arr,i+1,sum,k);
        
        return dp[i][sum] = take || skip;
    }
    public boolean checkSubsequenceSum(int[] arr, int k) {
        // code here
        
        dp = new Boolean[arr.length][k+1];
      return  solve(arr,0,0,k);
    }
}
