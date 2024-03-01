public class 숨어있는숫자의뎃셈1 {

    public int solution(String my_string) {
        char[] arr = my_string.toCharArray();
        int answer = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 48 && arr[i] < 58) {
                answer += arr[i] - 48;
            }
        }
        return answer;
    }
}
