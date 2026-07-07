class Solution {

    public String encode(List<String> strs) {
        StringBuilder str=new StringBuilder();
        for(String stri:strs)
        {
            str.append(stri.length()+"#"+stri);
        }
        return str.toString();
    }

    public List<String> decode(String str) {
        List<String> decode=new ArrayList<>();
        int i=0;
        while( i<str.length())
        {
            int sepidx=str.indexOf('#',i);
            int len=Integer.parseInt(str.substring(i,sepidx));
            i=sepidx+1;
            String decodestr=str.substring(i,i+len);
            decode.add(decodestr);
            i=i+len;

        }
        return decode;
    }
}
