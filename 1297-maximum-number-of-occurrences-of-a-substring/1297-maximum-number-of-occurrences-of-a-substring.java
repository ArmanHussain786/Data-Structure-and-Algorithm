class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        Map<String, Integer> res = new HashMap<>();
        Map<Character, Integer> map = new HashMap<>();
        int left = 0, right = 0;
        int max = 0;
        
        while(right < s.length()) {
            char curr = s.charAt(right);
            map.put(curr, map.getOrDefault(curr, 0) + 1);

            while(map.size() > maxLetters || right - left + 1 > maxSize) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                if(map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                left++;
            }
            while(map.size() <= maxLetters && right - left + 1 >= minSize 
               && right - left + 1 <= maxSize) {
                String str = s.substring(left, right + 1);
                res.put(str, res.getOrDefault(str ,0) + 1);
                max = Math.max(max, res.get(str));
                
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                if(map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                left++;
            }
            right++;
        }
        return max;
    }
}



//         Map<String, Integer> res = new HashMap<>();
//         Map<Character, Integer> map = new HashMap<>();
//         int left = 0, right = 0;
//         int max = 0;
        
//         while(right < s.length()) {
//             char curr = s.charAt(right);
//             map.put(curr, map.getOrDefault(curr, 0) + 1);

//             while(map.size() > maxLetters || right - left + 1 > maxSize) {
//                 char leftChar = s.charAt(left);
//                 map.put(leftChar, map.get(leftChar) - 1);
//                 if(map.get(leftChar) == 0) {
//                     map.remove(leftChar);
//                 }
//                 left++;
//             }
//             while(map.size() <= maxLetters && right - left + 1 >= minSize 
//                && right - left + 1 <= maxSize) {
//                 String str = s.substring(left, right + 1);
//                 res.put(str, res.getOrDefault(str ,0) + 1);
//                 max = Math.max(max, res.get(str));
                
//                 char leftChar = s.charAt(left);
//                 map.put(leftChar, map.get(leftChar) - 1);
//                 if(map.get(leftChar) == 0) {
//                     map.remove(leftChar);
//                 }
//                 left++;
//             }
//             right++;
//         }
//         return max;