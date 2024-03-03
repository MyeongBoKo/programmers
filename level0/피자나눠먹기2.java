public class 피자나눠먹기2 {

    public int solution(int n) {
        int answer = 1;
        int slice = 6;
        while (!(slice % n == 0)) {
            slice += 6;
            answer += 1;
        }
        return answer;
    }
}
