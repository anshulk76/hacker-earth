import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());      
        while(t-->0) {
            int n = Integer.parseInt(br.readLine());
            String[] str = br.readLine().split(" ");
            long occurence = (long) Math.pow(2, n-1);
            long result = 0;
            for(int i=0;i<n;i++) {
            	long number = Long.parseLong(str[i]);
            	if(number >= occurence) {
            		result+=number;
            	}
            }
            System.out.println(result%((long)Math.pow(10,9)+7));
        }
    }
}
