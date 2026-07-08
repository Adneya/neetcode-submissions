class Solution {
    public boolean checkfreq(int freq1[],int freq2[])
    {
        for(int i=0;i<26;i++)
        {
            if(freq1[i]!=freq2[i])
            {
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
       int freq[]=new int[26];
       for(int i=0;i<s1.length();i++)
       {
        freq[s1.charAt(i)-'a']++;
       }

       int window=s1.length();
       for(int i=0;i<s2.length();i++)
       {
        int windowidx=0;
        int idx=i;
        int winfreq[]=new int[26];
        while(windowidx<window && idx<s2.length())
        {
            winfreq[s2.charAt(idx)-'a']++;
            windowidx++;
            idx++;
        }
        if(checkfreq(freq,winfreq))
        {
            return true;
        }
       }
       return false;
    }
}
