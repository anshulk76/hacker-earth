
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
        	int p = Integer.parseInt(str[1]);
        	int q = Integer.parseInt(str[2]);
        	int r = Integer.parseInt(str[3]);
        	int[] ar = new int[n+1];
        	int count = 0;
        	for(int i=1;i*p<=n;i++){
        		int j = i*p;
        		if(ar[j]!=-1){
        			if(ar[j] == j){
            			ar[j] = -1;
            			count--;
            		}else{
            			ar[j] = j;
            			count++;
            		}
        		}
        	}
        	for(int i=1;i*q<=n;i++){
        		int j = i*q;
        		if(ar[j]!=-1){
        			if(ar[j] == j){
            			ar[j] = -1;
            			count--;
            		}else{
            			ar[j] = j;
            			count++;
            		}
        		}
        	}
        	for(int i=1;i*r<=n;i++){
        		int j = i*r;
        		if(ar[j]!=-1){
        			if(ar[j] == j){
            			ar[j] = -1;
            			count--;
            		}else{
            			ar[j] = j;
            			count++;
            		}
        		}
        	}
        	System.out.println(count);
        }
    }
}
