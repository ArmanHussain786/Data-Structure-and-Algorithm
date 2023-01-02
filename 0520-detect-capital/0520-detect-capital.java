class Solution {
    public boolean detectCapitalUse(String s) {
        int []count1 = new int[256];
        int []count2 = new int[256];
        int []count3 = new int[256];
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='A' && s.charAt(i)<='Z')
            {
                count1[s.charAt(i)-'A']++;
            }
             if(s.charAt(i)>='a' && s.charAt(i)<='z')
            {
                count2[s.charAt(i)-'a']++;
            }
             if(s.charAt(0)>='A' && s.charAt(0)<='Z')
            {
                count3[s.charAt(i)-'A']++;
            }
        }
        
        int sum1=0;
        int sum2=0;
        int sum3=0;
        int sum4=0;
        for(int i=0;i<26;i++)
        {
            sum1=sum1+count1[i];
            sum2=sum2+count2[i];
            sum3=sum3+count3[i];
        }
        System.out.println(sum1);
        int length=s.length();
        if(sum1==length || sum2==length || sum3==1)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}