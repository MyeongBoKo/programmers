public class 가위바위보 {

    public String solution(String rsp) {
        String answer = "";
        String[] rspArr = rsp.split("");

        for (String str : rspArr) {
            switch (str) {
                case "2" :
                    answer += "0";
                    break;
                case "0" :
                    answer += "5";
                    break;
                case "5" :
                    answer += "2";
                    break;
            }
        }
        return answer;
    }
}
