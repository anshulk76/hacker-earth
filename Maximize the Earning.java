
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
        	String[] str1 = br.readLine().split(" ");
        	int n = Integer.parseInt(str1[0]);
        	int r = Integer.parseInt(str1[1]);
        	String[] str2 = br.readLine().split(" ");
        	int[] array = Arrays.stream(str2).mapToInt(Integer::parseInt).toArray();
        	int count = 1;
        	for(int i=0;i<n-1;) {
        		int j=i+1;
        		while(j<n && array[j]<=array[i]) {
        			j++;
        		}
        		if(j<n && array[j]>array[i]) {
        			count++;
        		}
        		i = j;
        	}
        	System.out.println(count*r);
        }
    }
}
