class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        
        int p = 1;
        for(int i=0; i<len; i++){
            result[i] = p;
            p *= nums[i];
        }   
        p = 1;
        for(int i=len-1; i>-1; i--){
            result[i] *= p;
            p *= nums[i];
        }
        
        return result;
    }
}
