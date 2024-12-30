package baekjoon08;

import java.io.*;
import java.util.*;

public class Baekjoon08_07 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int day = Integer.parseInt(st.nextToken());
		int night = Integer.parseInt(st.nextToken());
		int result = Integer.parseInt(st.nextToken());
		int a = 0;

		if ((result - night) % (day - night) == 0) {
			a = (result - night) / (day - night);
		} else {
			a = (result - night) / (day - night) + 1;
		}

		System.out.println(a);

	}

}
