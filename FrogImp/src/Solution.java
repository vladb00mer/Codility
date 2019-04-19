class Solution {

    public int solution(int X, int Y, int D) {

        int tail = (Y-X)%D;

        if (tail > 0) return (Y-X)/D+1;
        else return (Y-X)/D;
    }
}