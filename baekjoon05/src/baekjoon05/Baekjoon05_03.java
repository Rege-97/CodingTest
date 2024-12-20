package baekjoon05;

import java.io.*;

public class Baekjoon05_03 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());
		String str = "";
		for (int i = 1; i <= num; i++) {
			str = br.readLine();
			for (int j = 0; j < str.length(); j++) {
				if (j == str.length() - 1) {
					bw.write(str.charAt(j));
				}
				if (j == 0) {
					bw.write(str.charAt(j));
				}
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();

	}

}
