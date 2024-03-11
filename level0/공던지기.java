public class 공던지기 {

    public int solution(int[] numbers, int k) {
        int num = numbers.length;
        int idx = 0;
        for (int i = 1; i < k; i++) {
            idx = (idx + 2) % num;
        }
        return num;
    }
}
