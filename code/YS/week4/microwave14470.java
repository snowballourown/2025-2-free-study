package week4;

import java.io.*;

public class microwave14470 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        //초
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());

        int total = 0;
        if(a <0) {
            while(a != 0) {
                total += c;
                a++;
            }
            total += d;
        }

        while(a != b){
            total += e;
            a++;
        }

        bw.write(total+" ");
        bw.flush();


        //현재
        //목표
        //얼
        //해동
        //상온

    }
}
