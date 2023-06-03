class Solution {
    public int[] shuffle(int[] nums, int n) {
        int start=n;
        int []arr = new int[nums.length];
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            ans.add(nums[i]);
            ans.add(nums[start]);
            start++;
        }
       for(int i=0;i<ans.size();i++)
       {
           arr[i]=ans.get(i);
       }
        return arr;
    }
}