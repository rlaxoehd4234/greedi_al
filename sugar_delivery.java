package greedi;

import java.io.*;
public class sugar_delivery {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int total = Integer.parseInt(br.readLine());
		int pocket = 0;
		int num = 0;
		
		pocket = total / 5;
		num = total % 5;
		
		if(total < 3) {
			System.out.println(-1);
		}
		else if(total ==7 || total == 4) {
			System.out.println(-1);
		}
		else if(num == 0) {
			System.out.println(pocket);
		}
		else if(num == 1) {
			System.out.println(pocket+1);
		}
		else if(num == 2) {
			System.out.println(pocket+2);
		}
		else if(num == 3) {
			System.out.println(pocket+1);
		}
		else if(num == 4) {
			System.out.println(pocket+2);
		}
		
		
		
		
		

	}

}
