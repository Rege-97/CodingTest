package baekjoon00;

import java.io.*;

public class B2741 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		for (int i = num; i >= 1; i--) {
			System.out.println(i);
		}

	}

}
