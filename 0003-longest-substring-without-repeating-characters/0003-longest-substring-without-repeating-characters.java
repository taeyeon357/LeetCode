import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        Set<String> hs = new HashSet<>();
        int l = 0;
        for(int r = 0; r < s.length(); r++){
            String sub = s.substring(r, r+1);
            if(hs.contains(sub)){
                hs.remove(s.substring(l,l+1));
                l++;
                r--;
            }else{
                hs.add(sub);
                maxLen = Math.max(maxLen, hs.size());
            }
        }
        return maxLen;
    }
}