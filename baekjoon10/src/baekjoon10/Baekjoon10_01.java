package baekjoon10;

import java.io.*;

public class Baekjoon10_01 {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		int result = num1*num2;
		
		System.out.println(result);
		

	}

}
