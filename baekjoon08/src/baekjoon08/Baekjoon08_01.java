package baekjoon08;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon08_01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		String str = st.nextToken();
		int arr[] = new int[str.length()];
		int num = Integer.parseInt(st.nextToken());

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
				arr[i] = str.charAt(i) - 48;
			} else if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				arr[i] = str.charAt(i) - 55;
			}

		}
		
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i-1; j++) {
				arr[i] = arr[i] * num;
			}
			sum+=arr[i];
		}

		System.out.println(sum);

	}

}
