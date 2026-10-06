class Solution {
    public boolean isBoomerang(int[][] pt) {
        int x1 = pt[0][0] , y1=pt[0][1];
        int x2 = pt[1][0] , y2=pt[1][1];
        int x3 = pt[2][0] , y3=pt[2][1];
        if((y2-y1)*(x3-x2) == (x2-x1)*(y3-y2))
            return false;
        return true;
    }
}