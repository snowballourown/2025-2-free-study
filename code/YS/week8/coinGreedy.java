package week8;

import java.io.*;
import java.util.ArrayList;


public class coin11047 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");

        int n = Integer.parseInt(list[0]);
        int k = Integer.parseInt(list[1]);
        int[] A = new int[n];

        for(int i=0;i<n;i++){
            String a = br.readLine();
            int b = Integer.parseInt(a);
            A[i] = b;
        }
        int re = 0;
        n -= 1 ;
        while(k>0){

            while(k>=A[n]){
                k -= A[n];
                re++;
            }
            n--;

        }
        bw.write(re+ "");
        bw.flush();


    }

}
