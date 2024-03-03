public class 외계행성의나이 {

    public String solution(int age) {
        String[] str = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        String answer = "";

        while (age > 0) {
            answer += str[age%10];
            age /= 10;
        }
        return answer;
    }
}
