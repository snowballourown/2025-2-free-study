package week5;

import java.io.*;

public class plusm31403 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int a = Integer.parseInt(br.readLine());
        String b = br.readLine();
        int bint = Integer.parseInt(b);
        int c = Integer.parseInt(br.readLine());

        System.out.println(a+bint-c);


        int n = bint-c;
        if(n==0) {
            System.out.print(a);
            for(int i =0;i<b.length();i++){
                System.out.print("0");
            }
        } else if (n<0) {
            a = a-1;
            n = n + 10;
            System.out.println(a+""+n);

        } else {
            System.out.println(a+""+n);
        }



//        StringBuilder sp = new StringBuilder();
//
//        sp.append(a);
//        sp.append(b);
//        System.out.println(a+b-c);
//        int n = Integer.parseInt(String.valueOf(sp));
//        System.out.println(n - c);
//
//

    }


}
