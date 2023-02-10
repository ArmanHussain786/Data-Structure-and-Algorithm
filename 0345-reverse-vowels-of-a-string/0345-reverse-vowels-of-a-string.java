class Solution {
    public String reverseVowels(String s) {
        if(s.length()==0)
            return s;
        char []str = s.toCharArray();
        int start=0;
        int end = str.length-1;
       while(start<end)
       {
           while(start<end && !isvowel(str[start]))
               start++;
           
           while(start<end && !isvowel(str[end]))
               end--;
           
           char temp = str[start];
           str[start]=str[end];
           str[end]=temp;
           start++;
           end--;
       }
        return new String(str);
    }
    
    private static boolean isvowel(char c) {
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
            || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
}
}