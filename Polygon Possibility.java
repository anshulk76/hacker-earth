
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());      
        while(t-->0) {
            int n = Integer.parseInt(br.readLine());
            String[] str = br.readLine().split(" ");
            int[] array = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(array);
            int sum = 0;
            for(int i=0;i<n-1;i++) {
            	sum+=array[i];
            }
            if(sum>array[n-1]) {
            	System.out.println("Yes");
            }else {
            	System.out.println("No");
            }
        }
    }
}
