public class 합성수찾기 {

    public int solution(int n) {
        int[] arr = new int[n + 1];
        int answer = 0;

        for (int i = 2; i <= n; i++) {
            for (int j = i; j <= n; j += i) {
                arr[j]++;
            }
        }

        for (int i = 4; i <= n; i++) {
            if (arr[i] >= 2) {
                answer++;
            }
        }
        return answer;
    }
}
