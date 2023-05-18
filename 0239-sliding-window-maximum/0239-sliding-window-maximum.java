class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       List<Integer> ans = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();
        int i=0;
        int j=0;
        int n = nums.length;
        while(j<n)
        {
            while(!deque.isEmpty() && deque.peekLast()<nums[j])
            {
                deque.removeLast();
            }
            deque.addLast(nums[j]);
            
            if(j-i+1<k)
            {
                j++;
            }
            else if(j-i+1==k)
            {
                
                 ans.add(deque.peekFirst());
                if(deque.peekFirst()==nums[i])
                    deque.removeFirst();
                
               
                
                i++;
                j++;
                
            }
        }
        int arr[]= new int[ans.size()];
        for(int z=0;z<arr.length;z++)
        {
            arr[z]=ans.get(z);
        }
        return arr;
    }
}


//  List<Integer> ans = new ArrayList<>();
//         Deque<Integer> deque = new LinkedList<>();
//         int i = 0;
//         int j = 0;

//         if (k > nums.length) { // edge case
//             int max = Integer.MIN_VALUE;
//             for (int num : nums) {
//                 max = Math.max(max, num);
//             }
//             ans.add(max);
//             return ans;
//         }

//         while (j < nums.length) {
//             while (!deque.isEmpty() && deque.peekLast() < nums[j]) {
//                 deque.removeLast();
//             }
//             deque.addLast(nums[j]);
//             if ((j - i + 1) < k) {
//                 j++;
//             } else if (j - i + 1 == k) {
//                 ans.add(deque.peekFirst());
//                 if (deque.peekFirst() == nums[i]) {
//                     deque.removeFirst();
//                 }
//                 i++;
//                 j++;
//             }
//         }
//         return ans;