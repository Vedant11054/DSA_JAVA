class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(map.containsKey(ch))
            {
                map.put(ch,(map.get(ch)+1));
            }
            else
            {
                map.put(ch,1);
            }
        }
        int length = 0;
        boolean oddfound = false;

        for (int i : map.values()) 
        {
            if (i % 2 == 0) 
            {
                length += i;
            } 
            else 
            {
                length += i - 1;
                oddfound = true;
            }
        }
        if(oddfound)
        {
            return length+1;
        }
        return length;
    }
}