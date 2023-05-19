class Solution {
    public boolean isVowel(char ch)
    {
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
            return true;
        }
        return false;
    }
    public int maxVowels(String s, int k) {
        int i=0;
        int j=0;
        int ans =0;
        int n = s.length();
        int count=0;
        while(j<n)
        {
            if(isVowel(s.charAt(j)))
            {
              
                count++;
            }
            if(j-i+1>k)
            {
                if(isVowel(s.charAt(i)))
                {
                    count--;
                }
                i++;
            }
            
            if(j-i+1==k)
            {
                ans = Math.max(ans , count);
            }
            
            j++;
            
         }  
        return ans;
    }
}


//  while (right < s.length()) {
//             if (vowels.contains(s.charAt(right))) {
//                 currentVowels++;
//             }

//             if (right - left + 1 > k) {
//                 if (vowels.contains(s.charAt(left))) {
//                     currentVowels--;
//                 }
//                 left++;
//             }

//             if (right - left + 1 == k) {
//                 maxSize = Math.max(maxSize, currentVowels);
//             }

//             right++;
//         }

//         return maxSize;