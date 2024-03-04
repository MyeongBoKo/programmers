public class K의개수 {

    public int solution(int i, int j, int k) {
        int answer = 0;
        String str = String.valueOf(k);

        for (int l = i; l <= j; l++) {
            String b = String.valueOf(l);

            for (int m = 0; m < b.length(); m++) {
                if (String.valueOf(b.charAt(m)).equals(str)) {
                    answer += 1;
                }
            }
        }
        return answer;
    }
}
