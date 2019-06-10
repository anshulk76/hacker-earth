
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
        int[] array = Arrays.stream(str1).mapToInt(Integer::parseInt).toArray();
        int time = 0, index = 0;
        for(int i=0;i<n;i++) {
        	int a = Integer.parseInt(str2[i]);
        	while(true){
        		if(array[index] != 0 && array[index] != a) {
        			time++;
        			index = (index+1)%n;
        		}else if(array[index] == a) {
        			array[index] = 0;
        			time++;
        			index = (index+1)%n;
        			break;
        		}else if(array[index] == 0) {
        			index = (index+1)%n;
        		}
        	}
        }
        System.out.println(time);
    }
}
