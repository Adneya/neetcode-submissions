class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashSet<Character> seen=new HashSet<>();
       int left=0;
       int maxlen=0;

       for(int right=0;right<s.length();right++)
       {
        char currchar=s.charAt(right);
        while(seen.contains(currchar))
        {
            seen.remove(s.charAt(left));
            left++;
        }
        seen.add(currchar);
        maxlen=Math.max(maxlen,right-left+1);
       }
       return maxlen;
    }
}
