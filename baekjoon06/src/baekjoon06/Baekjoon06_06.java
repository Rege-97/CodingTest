package baekjoon06;

import java.io.*;

public class Baekjoon06_06 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		char arr[] = new char[str.length()];
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);

		}
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 'c' && arr[i + 1] == '=' && i < arr.length - 1) {
				count++;
				i++;

			} else if (arr[i] == 'c' && arr[i + 1] == '-' && i < arr.length - 1) {
				count++;
				i++;

			} else if (arr[i] == 'd' && arr[i + 1] == 'z' && arr[i + 2] == '=' && i < arr.length - 2) {
				count++;
				i++;

			} else if (arr[i] == 'd' && arr[i + 1] == '-' && i < arr.length - 1) {
				count++;
				i++;

			} else if (arr[i] == 'l' && arr[i + 1] == 'j' && i < arr.length - 1) {
				count++;
				i++;

			} else if (arr[i] == 'n' && arr[i + 1] == 'j' && i < arr.length - 1) {
				count++;
				i++;

			} else if (arr[i] == 's' && arr[i + 1] == '=' && i < arr.length - 1) {
				count++;
				i++;

			} else if (arr[i] == 'z' && arr[i + 1] == '=' && i < arr.length - 1) {
				count++;
				i++;

			} else {
				count++;

			}
		}
		System.out.println(count);

	}

}
