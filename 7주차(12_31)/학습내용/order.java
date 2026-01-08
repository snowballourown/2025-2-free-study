package week7;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class order {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0, end = N-1, count = 0;
        Arrays.sort(arr);
        while(start < end) {
            int sum = arr[start] + arr[end];
            if(sum < M) start++;
            else if(sum > M) end--;
            else {
                //sum == M
                count++;
                start++;
                end--;
            }
        }


        bw.write(""+count);
        br.close();
        bw.flush();
        bw.close();
    }
}