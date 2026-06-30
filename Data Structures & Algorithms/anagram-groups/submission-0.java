class Solution {
   static final int MAX_CHAR=26;
   static String getHash(String s)
   {
    StringBuilder sb=new StringBuilder();
    int[] freq=new int[MAX_CHAR];

    for(char ch:s.toCharArray())
    {
        freq[ch-'a']++;
    }
    for(int i=0;i<MAX_CHAR;i++)
    {
        sb.append(freq[i]);
        sb.append("$");
    }
    return sb.toString();
   }
    public List<List<String>> groupAnagrams(String[] strs) {
      List<List<String>> arr=new ArrayList<>();
        HashMap<String,Integer> mp=new HashMap<>();
         for (int i = 0; i < strs.length; i++) {
            String key = getHash(strs[i]);
            
            if (!mp.containsKey(key)) {
                mp.put(key, arr.size());
                arr.add(new ArrayList<>());
            }

            // Insert the string in its correct group
            arr.get(mp.get(key)).add(strs[i]);
        }
        return arr;
    }
}
