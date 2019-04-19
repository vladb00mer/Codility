class Solution {

    public int solution(int[] A, int[] B) {

        int[] mult = new int[A.length];
        int count = 0;

        for (int i = 0; i < A.length; i++) {

            mult[i] = A[i] + (B[i] * 1000000);
        }

        for (int i = 0; i < mult.length; i++) {

            for (int j = 0; j < mult.length; j++) {

                if ((mult[i] * mult[j]) >= (mult[i] + mult[j])) count++;
            }
        }

        count = count/2-1;

        return count > 1000000000? 1000000000:count;
    }
}