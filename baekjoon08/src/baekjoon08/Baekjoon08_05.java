package baekjoon08;

import java.io.*;

public class Baekjoon08_05 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		int count = 0;
		int a = 0;
		int cheak_s = 1;
		int cheak_e = 1;

		while (true) {

			if (cheak_s <= num && num <= cheak_e) {
				count++;
				break;
			} else {
				a += 6;
				cheak_s = cheak_e + 1;
				cheak_e += a;
				count++;
			}

		}

		System.out.println(count);
	}

}
