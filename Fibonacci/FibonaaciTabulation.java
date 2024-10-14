// Tabulation or Bottom Up Approach ie. Smaller values will be stated adding from ground state to larger state 
// & we keep the value in some table structure so it's called tabulation.
public class FibonacciTabulation{
    public static void main(String[] args){
        if(n<=1) return n; 
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2; i<n; i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}