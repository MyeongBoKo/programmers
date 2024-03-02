public class 대문자와소문자 {

    public String solution1(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (c >= 'a' && c <= 'z') {
                answer += Character.toUpperCase(c);
            } else {
                answer += Character.toLowerCase(c);
            }
        }

        return answer;
    }

    public String solution2(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (Character.isUpperCase(c)) {
                answer += String.valueOf(c).toLowerCase();
            } else {
                answer += String.valueOf(c).toUpperCase();
            }
        }

        return answer;
    }
}
