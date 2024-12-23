package baekjoon05;

import java.io.*;

public class Baekjoon05_11 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = "";

		for (int i = 0; i < 100; i++) {
			str = br.readLine();
			if (str==null ||str.equals("")) {
				break;
			}
			bw.write(str+"\n");
		}
		bw.flush();
		bw.close();

	}

}
