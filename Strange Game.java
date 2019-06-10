
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());      
        while(t-->0){
        	String[] str = br.readLine().split(" ");
        	int n = Integer.parseInt(str[0]);
        	int k = Integer.parseInt(str[1]);
        	String[] str1 = br.readLine().split(" ");
        	int[] array1 = Arrays.stream(str1).mapToInt(Integer::parseInt).toArray();
        	String[] str2 = br.readLine().split(" ");
        	int[] array2 = Arrays.stream(str2).mapToInt(Integer::parseInt).toArray();
        	Arrays.sort(array2);
        	Arrays.sort(array1);
        	int max = array2[n-1]+1;
        	long time = 0;
        	for(int i=0;i<n;i++){
        		if(array1[i]<max){
        			time+=k*(max-array1[i]);
        		}else{
        			break;
        		}
        	}
        	System.out.println(time);
        }
    }
}
