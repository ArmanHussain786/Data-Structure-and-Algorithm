class Solution {
    public int divisorSubstrings(int num, int k) {
        String ans  = String.valueOf(num);
        int count=0;
        for(int i=0;i<ans.length()-k+1;i++)
        {
            String temp = ans.substring(i,i+k);
            int n1 = Integer.valueOf(temp);
            if(n1==0)
            {
                continue;
            }
            if(num%n1==0)
            {
                count++;
            }
        }
        return count;
        
    }
}

// String str=String.valueOf(num); // to covert integer to String
//         int count=0;   // count of ans..
//         for(int i=0;i<str.length()-k+1;i++)  // deciding the starting index of window
//         {
//             String temp=str.substring(i,i+k);    // storing string till window length
//             int n1=Integer.valueOf(temp);       // converting string to integer
//             if(n1==0)     // to avoid division error
//             {
//                 continue;
//             }
//             if(num%n1==0)      // if it is divisible then increase the count
//             {
//                 count++;
//             }
//         }
//         return count;  // lastly return our count