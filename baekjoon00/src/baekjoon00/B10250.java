package baekjoon00;

import java.io.*;
import java.util.*;

public class B10250 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int cas = Integer.parseInt(br.readLine());

		for (int i = 1; i <= cas; i++) {
			st = new StringTokenizer(br.readLine());
			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int g = Integer.parseInt(st.nextToken());
			int count = 0;

			for (int j = 1; j <= w; j++) {
				for (int z = 1; z <= h; z++) {
					count++;
					if (count == g) {
						if (j < 10) {
							bw.write(z + "0" + j + "\n");
							break;
						} else {
							bw.write(z + "" + j + "\n");
							break;
						}
					}
				}
				if (count == g) {
					break;
				}
			}

		}
		bw.flush();
		bw.close();

	}

}
