
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
        int max_index = 0;
        do {
        	max_index = max_index+1;
        	for(int i=max_index;i<n;i++) {
        		if(array[i] > array[max_index]) {
        			max_index = i;
        		}
        	}
        	System.out.print(array[max_index]+" ");
        }while(max_index<n-1);
    }
}
