class Solution {
    public int trap(int[] height) {
        Deque<Integer> stk = new ArrayDeque<>();
        int volume = 0;
        
        for(int i=0; i<height.length; i++){
            while(!stk.isEmpty() && height[i] > height[stk.peek()]){
                Integer top = stk.pop();
                
                if(stk.isEmpty()) break;
                
                int distance = i-stk.peek()-1;
                int water = Math.min(height[i], height[stk.peek()])-height[top];
                
                volume += distance * water;
            }
            stk.push(i);
            
        }
        return volume;
    }
}