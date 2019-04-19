import java.util.Arrays;

class Solution {

    public int solution(int[] A) {

        Arrays.sort(A);
        int res = A[A.length-1];

        for (int i = 0; i < A.length-1; i+=2) {

            if (A[i] != A[i+1]) {

                res = A[i];
            }
        }
        return res;
    }
}