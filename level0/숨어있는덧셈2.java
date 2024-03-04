public class 숨어있는덧셈2 {

    public int solution(String my_string) {
        int answer = 0;

        String str = "";
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) >= 48 && my_string.charAt(i) < 58) {
                str += my_string.charAt(i) + "";
            } else if (!str.isEmpty()) {
                answer += Integer.parseInt(str);
                str = "";
            }
        }

        // 마지막 숫자 처리
        if (!str.isEmpty()) {
            answer += Integer.parseInt(str);
        }
        return answer;
    }
}
