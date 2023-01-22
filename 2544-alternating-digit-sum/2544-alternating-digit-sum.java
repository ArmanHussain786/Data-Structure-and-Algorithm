class Solution {
    public int alternateDigitSum(int n) {
       int ans = 0;

        String num = Integer.toString(n);
        int size = num.length();

        while(n > 0){
            if(size%2 == 0){
                ans -= n % 10;
                n /= 10;
            }
            else{
                ans += n % 10;
                n /= 10;
            }
            size--;
        }
        return ans;
    }
}