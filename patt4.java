import java.util.*;
import java.lang.*;
import java.io.*;

public class patt4 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = 1;
        String[] invertArr = new String[n];
        for (int i = 1; i <= n; i++) {
            String store = "";

            for (int j = 0; j < i; j++) {
                store = store + m + "*";
                m++;
            }
            System.out.print(store.substring(0, store.length() - 1));
            System.out.println();
            invertArr[i-1] = store.substring(0, store.length() - 1);
        }
        
        for(int i=invertArr.length-1; i!=-1; i--){
            System.out.println(invertArr[i]);
        }
    }

}
