class Solution {
    public String[] reorderLogFiles(String[] logs) {
        // Comparator<Integer> comp = new Comparator<Integer>(){
        //      public int compareTo(Integer i, Integer j)
        //      {
        //          if(i> j)
        //          {
        //              return 1;
        //          }
        //      }
        // };
       List<String> let = new ArrayList<>();
        List<String> digit = new ArrayList<>();
        
        
        for (String log : logs) {
            if (Character.isDigit(log.split(" ", 2)[1].charAt(0))) {
                digit.add(log);
            } else {
                let.add(log);
            }
        }
        
       
        Collections.sort(let, new Comparator<String>() {
            public int compare(String s1, String s2) {
                String[] split1 = s1.split(" ", 2);
                String[] split2 = s2.split(" ", 2);
                int cmp = split1[1].compareTo(split2[1]);
                if (cmp != 0) return cmp;
                return split1[0].compareTo(split2[0]);
            }
        });
        
        // Combine sorted letter-logs and original digit-logs
        String[] result = new String[logs.length];
        int i = 0;
        for (String log : let) result[i++] = log;
        for (String log : digit) result[i++] = log;
        
        return result;
    }
}