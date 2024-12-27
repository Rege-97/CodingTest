package baekjoon08;

import java.io.*;
import java.util.*;

public class Baekjoon08_02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		int count = 0;
		int temp = num1;

		while (true) {
			if (temp / num2 >= num2) {
				temp = temp / num2;
				count++;
			} else {
				if(count==0) {
					count++;
				}else {
					count+=2;					
				}
				break;
			}
		}
		char arr[] = new char[count];

		for (int i = 0; i < arr.length; i++) {

			if ((num1 % num2) >= 0 && (num1 % num2) <= 9) {
				arr[arr.length - 1 - i] = (char) ((num1 % num2) + 48);
			} else if ((num1 % num2) >= 10 && (num1 % num2) <= 35) {
				arr[arr.length - 1 - i] = (char) ((num1 % num2) + 55);
			}

			num1 = num1 / num2;
		}

		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}



	}

}
