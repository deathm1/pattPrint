import java.util.*;
import java.lang.*;
import java.io.*;

public class patt2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int m=1;
        int pow =1;
        boolean invert = false;
        for(int i=1; i<=n; i++){
            if(invert){


                int fac = pow;
                pow = pow + 2;
                int ts = m+fac;

                invert = false;
                String store = "";
                for(int j=0; j<i; j++){
                    store = store + ts +"*";
                    ts--;
                    m++;
                }
                
                System.out.print(store.substring(0,store.length()-1));

            }
            else{
                String store = "";
                invert = true;
                for(int j=0; j<i; j++){
                    store = store + m +"*";
                    m++;
                }
                System.out.print(store.substring(0,store.length()-1));
            }
            System.out.println();
        }
    }
}
