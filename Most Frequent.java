
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
            TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();

            for(int i=0;i<n;i++) {
            	int a = Integer.parseInt(str[i]);
            	if(map.containsKey(a)) {
            		map.put(a, map.get(a)+1);
            	}else {
            		map.put(a, 1);
            	}
            }
            int max = map.firstKey();
            for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            	if(entry.getValue()> map.get(max)) {
            		max = entry.getKey();
            	}
            }
            System.out.println(max);
    }
}
