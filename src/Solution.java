class Solution {
    public boolean judgeCircle(String moves) {
        int lCount = 0;
        int rCount = 0;
        int uCount = 0;
        int dCount = 0;

        for(int i = 0; i < moves.length(); i++){
            if(moves.charAt(i) == 'L')
                lCount++;
            if(moves.charAt(i) == 'R')
                rCount++;
            if(moves.charAt(i) == 'U')
                uCount++;
            if(moves.charAt(i) == 'D')
                dCount++;
        }

        return (lCount == rCount) && (dCount == uCount);
    }
}
