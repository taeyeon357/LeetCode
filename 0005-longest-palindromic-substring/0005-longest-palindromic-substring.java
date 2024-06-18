class Solution {
    
    int left, maxLen;
    
    public String longestPalindrome(String s) {
            
        if(s.length() < 2) return s;
        
        for(int i=0; i<s.length(); i++){
            palindrome(s,i,i+1);
            palindrome(s,i,i+2);
        }
        
        return s.substring(left, left+maxLen);
    }
    
    public void palindrome(String s, int j, int k){
        while(j>=0 && k < s.length() && s.charAt(j) == s.charAt(k)){
            j--;
            k++;
        }
        
        if(maxLen < k-j-1){
            left = j+1;
            maxLen = k-j-1;
        }
    }
}