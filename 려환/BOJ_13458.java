import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_13458 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [] a = new int [N]; // 응시장
        int cnt = 0;

        String [] arr = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(arr[i]);
        }

        arr = br.readLine().split(" ");
        int b = Integer.parseInt(arr[0]);  // 총 감독관이 한 시험장에서 응시할 수 있는 수
        int c = Integer.parseInt(arr[1]);  // 부 감독관이 "
        // 입력부 완

        for (int i = 0; i < N; i++) {
            a[i] -= b;  // 일단 이 강의실에서 총 감독관이 맡을 수 있는 수 빼
            cnt ++;  // 총 감독관 한 분 들어오심
            if(a[i] <= 0){  // 만약 총 감독관 역량 내라면 끝~
                continue;
            }else{  // 부 감독관이 필요한 경우
                cnt += a[i]/c; // 부 감독관 수로 그냥 나눠버리고
                if(a[i] % c > 0){   // 나머지 있으면 증가시킴
                    cnt++;
                }
            }
        }
        System.out.print(cnt);  // 출력
        // 왜 틀렸는지 모르곘읍니다.... 머리가 안돌아갑니다...
    }
}
