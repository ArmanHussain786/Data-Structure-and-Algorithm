class Solution {
    public boolean halvesAreAlike(String s) {
        int n=s.length();
        int count1[]=new int[256];
        int count2[]=new int[256];
        for(int i=0;i<n/2;i++)
        {
            if(s.charAt(i)=='a' ||s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o'   || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U')
            {
                count1[s.charAt(i)]++;
            }
        }
        for(int i=n/2;i<n;i++)
        {
            if(s.charAt(i)=='a' ||s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o'   || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U')
            {
                count2[s.charAt(i)]++;
            }
        }
        int ans1=0;
        for(int i=0;i<count1.length;i++)
        {
            if(count1[i]>0)
            {
                ans1=ans1+count1[i];
         
            }
        }
        System.out.println(ans1);
        int ans2=0;
        
        for(int i=0;i<count2.length;i++)
        {
            if(count2[i]>0)
            {
                ans2=ans2+count2[i];
            }
        }
        System.out.println(ans2);
        if(ans1!=ans2)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}