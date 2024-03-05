import java.util.Arrays;

public class 가까운수 {

    public int solution(int[] array, int n) {
        Arrays.sort(array);

        int answer = array[0];
        for (int i = 0; i < array.length; i++) {
            if (Math.abs(n - array[i]) < Math.abs(n - answer)) {
                answer = array[i];
            }
        }
        return answer;
    }
}
