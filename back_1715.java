package greedi;

import java.io.*;
import java.util.Arrays;

public class back_1715 {
	//CARD SORTING
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] card = new int[n];
		int total = 0 ;
		
		for(int i = 0 ; i < n; i ++) {
			card[i] = Integer.parseInt(br.readLine());
			
		}
		
		
		Arrays.sort(card);
		
		for(int i = 0 ; i <card.length; i ++) {
			total+= card[i];
		}
		System.out.println(total);
		
	}

}
