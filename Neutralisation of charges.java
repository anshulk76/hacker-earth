
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int n = Integer.parseInt(br.readLine());      
         String s = br.readLine();
         ArrayList<Character> ar = new ArrayList<>();
         ar.add('0');
         for(int i=0; i<s.length(); i++) {
        	 int index = ar.size()-1;
        	 if(ar.get(index) == s.charAt(i)) {
        		 ar.remove(index);
        	 }else {
        		 ar.add(s.charAt(i));
        	 }
         }
         ar.remove(0);
         System.out.println(ar.size());
         for(int i=0; i<ar.size(); i++) {
        	 System.out.print(ar.get(i));
         }
    }
}
