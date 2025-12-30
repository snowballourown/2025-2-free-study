package week6;

import java.io.*;
import java.util.Arrays;

public class jumong19400 {

    public static void main(String[] args) throws IOException  {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");


        int[] num = new int[n];


        for(int i=0;i<str.length;i++){
            num[i] = Integer.parseInt(str[i]);
        }

        int x = 0;
        int y = n-1;

        int result = 0;
        Arrays.sort(num);
        while (x<y){
            int sum =0;
            sum = num[x] + num[y];
            if(sum < m){
                x++;
            } else if (sum > m){
                y--;
            } else {
                x++;
                y--;
                result++;
            }
        }

        bw.write(result+"");
        bw.flush();




    }
}
