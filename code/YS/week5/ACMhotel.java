package week5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ACMhotel {

    public static void main(String[] args) throws IOException {

        //몇번 테스트 할지 숫자 받기
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        //테스트 케이스 받기

        //테스트 만큼 반복
        //3분할하기
        for(int i=0;i<n;i++){
            StringBuilder sp = new StringBuilder();
            String[] a = br.readLine().split(" ");
            //층
            int h =Integer.parseInt(a[0]) ;
            //방갯수
            int w =Integer.parseInt(a[1]) ;
            //손님 몇번째인지
            int N =Integer.parseInt(a[2]) ;

            //층수 구하기 N번째 사람을 층으로 나눈 나머지
            int floor = N%h;
            int ho =0;
            if(N%h == 0 ){
                ho = N/h;
            } else {
                ho = N/h+1;
            }
            //호수 구하기 : 사람을 층으로 나눈 몫 +!
            String h2 = String.format("%02d", ho);
            //문자열 붙이기
            sp.append(floor+ h2);
            //출력하기 + 줄바
            System.out.println(sp);

        }

        //반복 끝



    }
}
