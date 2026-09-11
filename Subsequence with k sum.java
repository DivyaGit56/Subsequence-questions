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
