package week8;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class DFSandBFS {

    static int n;
    static int m;
    static boolean V[];
    static ArrayList<Integer>[] A;

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {



        String[] li = br.readLine().split(" ");
        int start =0;

        n = Integer.parseInt(li[0]);
        m = Integer.parseInt(li[1]);
        start = Integer.parseInt(li[2]);

        V = new boolean[n+1];
        A = new ArrayList[n+1];
        for(int i=0;i<n+1;i++){
            A[i] = new ArrayList<Integer>();
        }
        int u,v;
        for(int i=0;i<m;i++){
            li = br.readLine().split(" ");
            u = Integer.parseInt(li[0]);
            v = Integer.parseInt(li[1]);
            A[u].add(v);
            A[v].add(u);

        }
        for(int i=0;i<=n;i++){
            Collections.sort(A[i]);
        }
        DFS(start);
        bw.flush();
        bw.newLine();
        V = new boolean[n+1];
        BFS(start);
        bw.flush();

    }

    public static void DFS(int s) throws IOException {
        if(V[s]){
            return;
        }
        V[s] = true;
        bw.write(s+ " ");
        for(int i : A[s]){
            DFS(i);
        }
    }

    public static void BFS(int s) throws IOException{

        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(s);
        V[s]= true;
        while(!queue.isEmpty()){
            int newNode = queue.poll();
            bw.write(newNode + " ");
            for(int i : A[newNode]){
                if(!V[i]){
                    V[i] = true;
                    queue.add(i);
                }
            }

        }

    }

}
