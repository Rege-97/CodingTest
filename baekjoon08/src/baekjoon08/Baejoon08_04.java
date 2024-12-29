package baekjoon08;

import java.io.*;

public class Baejoon08_04 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		int line = 2;
		int dot = 0;

		for (int i = 0; i < num; i++) {
			line = (line * 2) - 1;
		}
		dot = line*line;
		
		System.out.println(dot);

	}

}
