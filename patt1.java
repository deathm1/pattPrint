import java.util.*;
import java.lang.*;
import java.io.*;


public class patt1{
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int m=1;

        for(int i=1; i<=n; i++){
            for(int j=0; j<i; j++){
                System.out.print(m +" ");
                m++;
            }
            System.out.println();
        }
    }
}