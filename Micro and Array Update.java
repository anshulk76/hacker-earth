
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
            String[] str2 = br.readLine().split(" ");
            int[] array = Arrays.stream(str2).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(array);
            int result = Integer.parseInt(str1[1])-array[0];
            if(result>0){
                System.out.println(result);
            }else{
                System.out.println(0);
            }
        }
    }
}
