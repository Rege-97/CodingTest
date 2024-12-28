package baekjoon03;

import java.io.*;

public class Baekjoon03_10 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());

		for (int i = 1; i <= num; i++) {
			for (int j = i; j < i + num; j++) {
				if (j >= num) {
					System.out.print("*");
				} else {
					System.out.print(" ");

				}
			}
			System.out.println(); 
		}

	}

}
