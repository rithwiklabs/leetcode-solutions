class Solution {
    public int alternateDigitSum(int n) {
        int oddsum = 0, evensum = 0;
        char[] nums = String.valueOf(n).toCharArray();

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0)
                evensum += nums[i] - '0';
            else
                oddsum += nums[i] - '0';
        }
        return evensum - oddsum;
    }
}