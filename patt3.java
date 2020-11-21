import java.util.*;
import java.lang.*;
import java.io.*;

public class patt3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=1; i<=n; i++){
            String store = "";
            for(int j=0; j<i; j++){
                store = store + i +"*";
            }
            System.out.print(store.substring(0,store.length()-1));
            System.out.print(" ");
        }
        for(int i=n; i!=0; i--){
            String store = "";
            for(int j=0; j<i; j++){
                store = store + i +"*";
            }
            System.out.print(store.substring(0,store.length()-1));
            System.out.print(" ");
        }
        
    }
}
