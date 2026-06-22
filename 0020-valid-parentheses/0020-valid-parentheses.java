class Solution {
    public boolean isValid(String s) 
    {
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(stack.empty() && (s.charAt(i)==')' || s.charAt(i)==']' || s.charAt(i)=='}'))
            {
                return false;
            }
            else if(!stack.empty() && stack.peek()=='(' && s.charAt(i)==')')
            {
                stack.pop();
            }
            else if(!stack.empty() && stack.peek()=='{' && s.charAt(i)=='}')
            {
                stack.pop();
            }
            else if(!stack.empty() && stack.peek()=='[' && s.charAt(i)==']')
            {
                stack.pop();
            }
            else
            {
                stack.push(s.charAt(i));
            }
        }
        System.out.println(stack);
        if(stack.empty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}