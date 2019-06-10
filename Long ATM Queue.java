
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] array = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
        int result = 1;
        for(int i=0;i<n-1;) {
        	if(array[i] <= array[i+1]) {
        		i++;
        	}else {
        		result++;
        		i++;
        	}
        }
        System.out.println(result);
    }
}
