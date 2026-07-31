class Solution {
    public static boolean isOdd(int num)
    {
        return num%2 != 0;
    }
    public boolean threeConsecutiveOdds(int[] arr) {
        for(int i=0;i<arr.length-2;i++)
        {
            if(isOdd(arr[i]) && isOdd(arr[i+1]) && isOdd(arr[i+2]))
                return true;
        }
        return false;
    }
}