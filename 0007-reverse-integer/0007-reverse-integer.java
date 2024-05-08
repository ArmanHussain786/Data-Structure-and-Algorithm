class Solution {
    public int reverse(int x) {
        //123  --> -321
//         int ref = x;
//         int res=0;
//         while(x!=0)
//         {
//             int ans = x%10;
//             res = res*10+ans;
//             x=x/10;
//         }
       
//         if( res< Integer.MIN_VALUE || res>Integer.MAX_VALUE)
//         {
//             return 0;
//         }
//         else
//         {
//             return res;
//         }
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            int newResult = reversed * 10 + digit;
            // Check if the result overflows/underflows
            if ((newResult - digit) / 10 != reversed) {
                return 0;
            }
            reversed = newResult;
            x /= 10;
        }
        return reversed;
    }
}