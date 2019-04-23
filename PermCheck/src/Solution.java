import java.util.Arrays;

class Solution {

    public int solution(int[] A) {

        if (A.length == 1) return 1;

        int res = 1;
        Arrays.sort(A);

        for (int i = 0; i< A.length-1; i++) {

            if (A[i]+1 != A[i+1]) res = 0;
        }

        return res;
    }
}