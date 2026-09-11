class Solution {
        List<String>ans = new ArrayList<>();
    
    public void solve(String s,int i, String Currop ){
        if(i == s.length()){
            ans.add(Currop);
            return;
        }
        
        
        // current index add
        solve(s,i+1,Currop+s.charAt(i));
        
        // current index skip
        solve(s,i+1,Currop);
    }
    public List<String> powerSet(String s) {
        // Code here
        
        solve(s,0,"");
        
        Collections.sort(ans);
       return ans;
    }
}
