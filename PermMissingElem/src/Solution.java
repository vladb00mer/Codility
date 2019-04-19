import java.util.Arrays;

class Solution {

    public int solution(int[] A) {

        if(A == null || A.length == 0) {
            return 1;
        }

        long N = A.length + 1;
        long total = N * (N + 1) / 2;

        long sum = 0L;
        for(int i = 0; i < A.length; i++) {
            sum += A[i];
        }

        return (int) (total - sum);
    }
}