package baekjoon10;

import java.io.*;

public class Baekjoon10_04 {

	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		long num = Integer.parseInt(br.readLine());
		long result = 0;
		
		result= num*4;
		
		System.out.println(result);
		
	}

}
