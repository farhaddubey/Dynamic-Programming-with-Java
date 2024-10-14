import java.util.HashMap;
// Memoization---->Top Down Approach Top---> Down Smaller Portions 
public class FibonacciMemoization{
    private static HashMap<Integer, Integer> memo=new HashMap<>();
    private int fibonacci(int n){
        // Base Case 
        if(n<=1) return n; // 0 & 1 is handled 
        if(memo.containsKey(n)) return memo.get(n);
        int result=fibonacci(n-1)+fibonacci(n-2);
        memo.put(n, result); // We stored here, ie value is memorized in memory from bottom to top 
        return result;
    }
    public static void main(String[] args){
        FibonacciMemoization memoObj=new FibonacciMemoization();
        int result=memoObj.fibonacci(10);
        System.out.println(result);
    }
}