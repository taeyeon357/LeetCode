class Solution {
    public boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder();
        String s = String.valueOf(x);
        if(s.equals(sb.append(s).reverse().toString())) return true;
        else return false;
    }
}