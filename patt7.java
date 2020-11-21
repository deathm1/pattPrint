import java.util.*;
import java.io.*;
import java.lang.*;

public class patt7 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        logicDriver(n);
    }

    private static void logicDriver(int x) {

        String[] patt1Arr = new String[x];
        int val = 1;
        int dashCount = 0;

        // Print half patt 1
        for (int i = 0; i < x; i++) {
            String store = "";
            int xs = x;
            int dcs = dashCount;
            while (dcs != 0) {
                store = store + "-";
                dcs--;
            }

            // Print row
            for (int j = 0; j < xs - dashCount; j++) {
                store = store + val + "*";
                val++;
            }
            dashCount++;
            patt1Arr[i] = store;
        }

        int valCount = x;

        for (int i = 0; i < x; i++) {
            String patt = patt1Arr[valCount - 1];
            String store = "";
            for (int j = 0; j <= x - valCount; j++) {
                store = store + val + "*";
                val++;
            }
            patt = patt + store.substring(0, store.length() - 1);
            patt1Arr[valCount - 1] = patt;
            valCount--;
        }

        for (int i = 0; i < patt1Arr.length; i++) {
            System.out.println(patt1Arr[i]);
        }
    }
}
