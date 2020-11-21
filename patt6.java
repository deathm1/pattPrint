import java.util.*;
import java.lang.*;
import java.io.*;

public class patt6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        int m = 1;
        for(int i=0; i<n+1 ; i++){


            for(int j=0; j<n; j++){
                if(j>0 && j<n-1){

                    if(i>0 && i<n){
                        System.out.print(m+" ");
                        m++;
                    }
                    else{
                        System.out.print(n+" ");
                    }

                }
                else{
                    System.out.print(n+" ");
                }
            }



            System.out.println();
        }
    }
}
