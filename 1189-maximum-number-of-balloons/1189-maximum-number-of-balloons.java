class Solution {
    public int maxNumberOfBalloons(String text) {
        int ans=0;
        char arr[] = text.toCharArray();
        while(true)
        {
            String word="balloon";
            for(char c : word.toCharArray())
            {
                boolean found=false;
                for(int i=0;i<arr.length;i++)
                {
                    if(arr[i]==c)
                    {
                        arr[i]='*';
                        found=true;
                        break;
                    }
                }
                if(!found)
                    return ans;
            }
            ans++;
        }
    }
}