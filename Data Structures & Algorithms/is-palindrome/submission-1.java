class Solution {
    public boolean isPalindrome(String s) {
       String str=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
       String rev=new StringBuilder(str).reverse().toString();
       if(str.equals(rev))
       {
        return true;
       }
       return false;
    }
}
