package baekjoon05;

import java.io.*;

public class Baekjoon05_01 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str=br.readLine();
		int num=Integer.parseInt(br.readLine());
		char a=str.charAt(num-1);
		
		System.out.println(a);
	}

}
