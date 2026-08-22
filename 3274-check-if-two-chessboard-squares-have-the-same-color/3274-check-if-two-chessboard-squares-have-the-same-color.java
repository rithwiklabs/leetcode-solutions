class Solution {
    public boolean checkTwoChessboards(String coord1, String coord2) {
        return (coord1.charAt(0)+coord1.charAt(1))%2 == (coord2.charAt(0)+coord2.charAt(1))%2;
    }
}