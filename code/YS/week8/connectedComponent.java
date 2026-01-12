package week8;

import java.io.*;
import java.util.ArrayList;

public class connectedComponent {

    public static boolean[] B;
    public static ArrayList<Integer>[] list;

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] li = br.readLine().split(" ");

        int n = Integer.parseInt(li[0]);
        int m = Integer.parseInt(li[1]);
        B = new boolean[n+1];

        list = new ArrayList[n + 1];
        for (int i = 0; i < n + 1; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {

            li = br.readLine().split(" ");
            int u = Integer.parseInt(li[0]);
            int v = Integer.parseInt(li[1]);
            System.out.println("v = " + v);
            System.out.println("u = " + u);
            list[u].add(v);
            list[v].add(u);

        }

        int result = 0;
        for(int i=1;i<n+1;i++){
            if(!B[i]){
                result++;
                DFS(i);
            }

        }

        System.out.println(result);

    }

    public static void DFS(int v){

        if(B[v]){

            return;
        }
        B[v] =true;
        for(int i: list[v]){
            if(B[i]==false){
                DFS(i);
            }
        }



    }

}
