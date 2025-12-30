package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class trim {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] a = str.split(" ");
        System.out.println(a.length);

//        StringTokenizer st = new StringTokenizer(str , " ");
//        int n = st.countTokens();
//        System.out.println(n);

    }
}
