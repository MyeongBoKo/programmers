public class 칠의개수 {

    public int solution(int[] array) {
        int answer = 0;

        for (int num : array) {
            String str = String.valueOf(num);
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '7') {
                    answer += 1;
                }
            }
        }
        return answer;
    }
}
