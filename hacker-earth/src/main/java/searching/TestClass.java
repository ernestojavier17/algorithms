package searching;

//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input*/

        //BufferedReader
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);*/

        //Scanner
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();

        int result = -1;
        for (int i = 1; i <= N; i++) {
            if(M == s.nextInt()) {
                result = N;
            }
        }
        System.out.println(result);
    }
}
