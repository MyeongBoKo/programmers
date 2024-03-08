import java.util.Stack;

public class 컨트롤제트 {

    public int solution(String s) {
        Stack<Integer> stack = new Stack<>();
        String[] arr = s.split(" ");
        int answer = 0;
        for (String str : arr) {
            if (!str.equals("Z")) {
                stack.push(Integer.parseInt(str));
            } else {
                stack.pop();
            }
        }
        while (!stack.isEmpty()) {
            answer += stack.pop();
        }
        return answer;
    }
}
