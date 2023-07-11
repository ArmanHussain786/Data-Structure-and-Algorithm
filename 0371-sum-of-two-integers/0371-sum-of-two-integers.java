class Solution {
    public int getSum(int a, int b) {
         while (b != 0) {
            int carry = a & b;  // Calculate the carry bits
            a = a ^ b;         // Perform bitwise XOR to get the sum without carry
            b = carry << 1;    // Shift the carry bits to the left
        }
        return a;
    }
}
