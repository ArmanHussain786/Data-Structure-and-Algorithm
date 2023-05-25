//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while(t-- > 0){
            String input_line[] = read.readLine().trim().split("\\s+");
            String S1 = input_line[0];
            String S2 = input_line[1];
            Solution ob = new Solution();
            System.out.println(ob.merge(S1,S2));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String merge(String S1, String S2)
    { 
        // code here
        int s =0;
        int s1 =0;
        String str = "";
        while(s!=S1.length()  && s1 != S2.length())
        {
            str = str + S1.charAt(s);
            str = str + S2.charAt(s1);
            s++;
            s1++;
        }
        while(s!=S1.length())
        {
            str = str + S1.charAt(s);
            s++;
        }
        while(s1!=S2.length())
        {
            str = str + S2.charAt(s1);
            s1++;
        }
        return str;
    }
} 