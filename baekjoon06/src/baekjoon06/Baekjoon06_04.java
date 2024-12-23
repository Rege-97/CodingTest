package baekjoon06;

import java.io.*;

public class Baekjoon06_04 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		char arr[] = new char[str.length()];
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}

		for (int i = 0; i < arr.length / 2; i++) {
			if (arr[i] == arr[arr.length - 1 - i]) {
				count++;
			}
		}
		if(arr.length/2==count) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}

}
