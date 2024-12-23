package baekjoon05;

import java.io.*;

public class Baekjoon05_10 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int num = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 67) {
				num += 3;
			} else if (str.charAt(i) >= 68 && str.charAt(i) <= 70) {
				num += 4;
			} else if (str.charAt(i) >= 71 && str.charAt(i) <= 73) {
				num += 5;
			} else if (str.charAt(i) >= 74 && str.charAt(i) <= 76) {
				num += 6;
			} else if (str.charAt(i) >= 77 && str.charAt(i) <= 79) {
				num += 7;
			} else if (str.charAt(i) >= 80 && str.charAt(i) <= 83) {
				num += 8;
			} else if (str.charAt(i) >= 84 && str.charAt(i) <= 86) {
				num += 9;
			} else if (str.charAt(i) >= 87 && str.charAt(i) <= 90) {
				num += 10;
			}
		}
		System.out.println(num);
	}

}
