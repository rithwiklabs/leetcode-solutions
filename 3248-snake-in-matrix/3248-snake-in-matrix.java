class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int len=commands.size();
        int x=0,y=0;
        for(int i=0;i<len;i++)
        {
            String cmd = commands.get(i);
            if(cmd.equals("UP"))
                x--;
            else if(cmd.equals("DOWN"))
                x++;
            else if(cmd.equals("RIGHT"))
                y++;
            else if(cmd.equals("LEFT"))
                y--;
        }
        return (x*n)+y;
    }
}