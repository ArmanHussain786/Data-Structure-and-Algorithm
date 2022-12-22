class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        String str="";
        for(int i=0;i<s.length();i++)
        {
            
            if(st.size()>0 && s.charAt(i)=='#')
                st.pop();
            
            else if(s.charAt(i)!='#')
           st.push(s.charAt(i));
                
        }
        
        Stack<Character> ste = new Stack<>();
        for(int i=0;i<t.length();i++)
        {
            
            if(ste.size()>0 && t.charAt(i)=='#')
                ste.pop();
            
            else if(t.charAt(i)!='#')
           ste.push(t.charAt(i));
                
        }
        
        String s1 = "";
        String s2="";
        while(!st.isEmpty())
        {
            s1=s1+st.peek();
            st.pop();
        }
        while(!ste.isEmpty())
        {
            s2=s2+ste.peek();
            ste.pop();
        }
        System.out.println(s1);
         System.out.println(s2);
        
        return s1.equals(s2);
    }
}