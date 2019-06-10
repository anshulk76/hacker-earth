
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
        	String str = br.readLine();
        	char[] ch = str.toCharArray();
        	Arrays.sort(ch);
        	str = new String(ch);
        	int i = 0;
        	for(;i<str.length()-1;i++) {
        		if(str.charAt(i+1)-str.charAt(i) != 1) {
        			System.out.println("NO");
        			break;
        		}
        	}
        	if(i == str.length()-1) {
        		System.out.println("YES");
        	}
        }        
    }
}
