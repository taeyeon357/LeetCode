class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int leftMax = height[l];
        int rightMax = height[r];
        
        int result = 0;
        while(l<r){
            leftMax = Math.max(leftMax, height[l]);
            rightMax = Math.max(rightMax, height[r]);
            
            if(leftMax <= rightMax){
                result += (leftMax - height[l++]);
            }else{
                result += (rightMax - height[r--]);
            }
        }
        
        return result;
    }
}