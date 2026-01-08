package week7;

import java.io.*;

public class nandM {

    public static boolean V[];
    public static int arr[];
    public static int n;
    public static int m;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s[] = br.readLine().split(" ");

        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);

        V = new boolean[n];
        arr = new int[m];

        back(0);


    }

    public static void back(int len){

        if(len == m){
            print();
            return;
        }
        for(int i=0;i<n;i++){
            if(!V[i]){

                V[i] = true;
                arr[len] = i;
                back(len+1);
                V[i] = false;
            }
        }


    }

    public static void print(){
        for(int k=0;k<m;k++){
            System.out.print(arr[k]+1+ " ");
        }
        System.out.println();
    }

}
