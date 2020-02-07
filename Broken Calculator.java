TC: O(n)
SC: O(1)

Runtime: 59 ms, faster than 6.66% of Java online submissions for Broken Calculator.
Memory Usage: 38.3 MB, less than 14.29% of Java online submissions for Broken Calculator.

Approach: Trying to reach X from Y instead of Y from X.We can also try starting with X, but it will be 2^n combinations which give TLE

class Solution {
    public int brokenCalc(int X, int Y) {
        int count=0;
        if(X>Y) return X-Y;
        while(X!=Y){
            if(Y%2!=0) Y=Y+1;
            else if(Y>X) Y=Y/2;
            else Y=Y+1;
            count++;
            // System.out.println(Y);
        }
        System.out.println(count);
        return count;
    }
}
