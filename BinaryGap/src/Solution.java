import java.util.ArrayList;
import java.util.List;

class Solution {

    public int solution(int N) {

        List<Integer> positions = new ArrayList<>();
        int max = 0;

        int[] binArr = Integer.toBinaryString(N).chars().toArray();

        for (int i = 0; i < binArr.length; i++) {

            if (binArr[i] > 0) positions.add(i);
        }

        for (int i = 1; i < positions.size(); i++) {

            int dif = (positions.get(i+1) - positions.get(i));

            if (dif>max) {max = dif;}
        }

        return max;
    }
}