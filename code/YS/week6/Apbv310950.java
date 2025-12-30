package week6;

import java.io.*;
import java.util.StringTokenizer;

public class Apbv310950 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        //목표값 :
        int N = Integer.parseInt(br.readLine());


        //포인터 두개
        int a =0;
        int b =1;
        //정답 :
        int result = 1;
        //현재값 = 다 더한거
        int sum = 3;
        //배열 선언
        int[] list = new int[N];
        for(int i=0;i<N;i++){
            list[i] = i+1;
        }

        //반복문 : 언제멈추지? ->포인터 두개가 같을때
        while(a<b){
            //목표값 현재값에 따라 움직임- >
            if(sum < N){
                // 오른쪽 포인터 ++
                b++;
                // 현재값 += 배열[오른쪽]
                sum += list[b];
            } else if( sum == N){

                //현재 = 목표
                //정답 ++
                //왼쪽 포인터 ++
                // 현재값 -= 배열[왼쪽]
                sum -= list[a];
                a++;
                result++;

            } else{
                //현재 > 목표
                // 왼쪽 ++
                // 현재 -= 배열[왼쪽]
                sum -= list[a];
                a++;


            }


        }
        //답 출력
        System.out.println("result = " + result);

    }
}
