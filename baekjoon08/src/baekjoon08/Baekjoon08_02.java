package baekjoon08;

import java.io.*;
import java.util.*;

public class Baekjoon08_02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		
		String str="";

		while(num1>0) {

			if ((num1 % num2) >= 0 && (num1 % num2) <= 9) {
				str+= (char) ((num1 % num2) + 48);
			} else if ((num1 % num2) >= 10 && (num1 % num2) <= 35) {
				str+= (char) ((num1 % num2) + 55);
			}

			num1 = num1 / num2;
		}

		for (int i = str.length()-1; i >=0 ; i--) {
			System.out.print(str.charAt(i));
		}

	}

}
