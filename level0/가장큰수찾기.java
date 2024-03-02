public class 가장큰수찾기 {

    public int[] solution(int[] array) {
        int max = -1;
        int maxIdx = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIdx = i;
            }
        }
        int[] answer = {max, maxIdx};
        return answer;
    }
}
