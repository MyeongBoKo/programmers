public class 문자열계산하기 {

    public int solution(String my_string) {
        String[] sArr = my_string.split(" ");
        int answer = Integer.parseInt(sArr[0]);

        for (int i = 1; i < sArr.length; i += 2) {
            int num = Integer.parseInt(sArr[i + 1]);

            switch (sArr[i]) {
                case "+" :
                    answer += num;
                    break;
                case "-" :
                    answer -= num;
                    break;
            }
        }

        return answer;
    }
}
