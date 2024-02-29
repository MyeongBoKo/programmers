public class 모음제거 {

    public String solution(String my_string) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                answer += "";
            } else {
                answer += String.valueOf(arr[i]);
            }
        }
        return answer;
    }
}


