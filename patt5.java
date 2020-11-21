import java.util.*;
import java.lang.*;
import java.io.*;

public class patt5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ip = br.readLine().trim().split(" ");

        int inc = Integer.parseInt(ip[0]);

        String[] store = new String[Integer.parseInt(ip[1])];

        for(int i=1; i<=Integer.parseInt(ip[1]); i++){
            String temp = "";
            for(int j=0; j<i; j++){
                temp = temp + inc;
            }
            System.out.print(temp);
            inc++;

            store[i-1] = temp; 
            System.out.println();
        }

        for(int i=store.length-1; i!=-1; i--){
            System.out.println(store[i]);
        }
    }
}
