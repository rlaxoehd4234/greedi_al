package greedi;

import java.io.*;
import java.util.*;
public class third_ten {

	public static void main(String[] args) throws IOException {
		int[]arr = new int[10];
		int total = 0 ;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(),"");
		for(int i = 0; i < arr.length; i++) {
		
			arr[i]= Integer.parseInt(st.nextToken());
			total+=arr[i];
		}
		
		Arrays.sort(arr);
		
		if(total % 3 != 0) {
			
		}
	}

}
