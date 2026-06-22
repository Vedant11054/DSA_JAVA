class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int ans[]=new int[temperatures.length];
        Stack<Integer>stack=new Stack<>();
        for(int i=temperatures.length-1;i>=0;i--)
        {
            if(i==temperatures.length-1)
            {
                ans[i]=(0);
                stack.push(i);
                continue;
            }
            while(!stack.empty() && temperatures[stack.peek()]<=temperatures[i])
            {
                stack.pop();
            }
            if(stack.empty())
            {
                ans[i]=0;
            }
            else
            {
                ans[i]=stack.peek()-i;
            }
            stack.push(i);
        }
        return ans;
    }
}