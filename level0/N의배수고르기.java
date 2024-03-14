import java.util.ArrayList;

public class N의배수고르기 {
    public int[] solution(int n ,int[] numlist) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int x : numlist) {
            if (x % n == 0) {
                list.add(x);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
