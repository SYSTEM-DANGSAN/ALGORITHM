package bronze.시험감독;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    /*
     * N개의 시험장
     * 각각 시험장 마다 응시자들이 있다
     * i번 시험장 응시자는 A_i명
     * 총감독관, 부감독관 두 종류
     * 총감독 - B명 감시
     * 부감독 - C명 감시
     * 시험장 마다 총감독은 1명 부감독 여러명 가능
     * 응시생 모두 감시해야 함
     * 감독관 수 최소값
     *
     * */
    static Long n, b, c;
    static List<Long> a = new ArrayList<>();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Long.parseLong(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a.add(Long.parseLong(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        b = Long.parseLong(st.nextToken());
        c = Long.parseLong(st.nextToken());

        Long total = 0L;
        for (Long numOfStudent :
                a) {
            total += 1; // 총 감독관 하나 추가
            numOfStudent -= b; // 총 감독관이 감시 가능한 사람 빼기
            if (numOfStudent > 0) {
                total += numOfStudent % c == 0 ? numOfStudent / c : numOfStudent / c + 1;
            }
        }

        System.out.println(total);


    }
}
