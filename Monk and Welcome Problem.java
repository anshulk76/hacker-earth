
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str1 = br.readLine().split(" ");
        String[] str2 = br.readLine().split(" ");
        
        for(int i=0;i<n;i++){
            System.out.print(Integer.parseInt(str1[i])+Integer.parseInt(str2[i])+" ");
        }
    }
}
