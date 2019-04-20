class Solution {

    public int solution(int [] A) {

        int res = 0;

        if (A.length==1) return A[0];

        for (int i: A) { res ^= A[i]; }

        return res;
    }
}