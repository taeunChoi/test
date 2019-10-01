class Solution {
    public int[] dailyTemperatures(int[] T) {
        int res[] = new int[T.length];
        for(int i=0; i<T.length; i++) {
            for(int j=i+1; j<T.length; j++) {
                if(T[i] < T[j]) {
                    res[i] = (j-i);
                    break;
                }
            }
        }
        return res;
    }
    
    
//     public int[] dailyTemperatures(int[] T) {
//         int[] ans = new int[T.length];
//         Stack<Integer> stack = new Stack();
//         for (int i = T.length - 1; i >= 0; --i) {
//             while (!stack.isEmpty() && T[i] >= T[stack.peek()]) stack.pop();
//             ans[i] = stack.isEmpty() ? 0 : stack.peek() - i;
//             stack.push(i);
//         }
//         return ans;
//     }
}
