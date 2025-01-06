package baekjoon00;

import java.io.*;

public class B1463 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		int count = 0;
		while (num != 1) {
			if (num % 3 != 0) {
				num = num - 1;
				count++;
				System.out.println("1 뺌");
				System.out.println(num+"-"+count);
			}
			if (num % 3 == 0) {
				num = num / 3;
				count++;
				System.out.println("3 나눔");
				System.out.println(num+"-"+count);
			}
			if (num % 2 == 0) {
				num = num / 2;
				count++;
				System.out.println("2 나눔");
				System.out.println(num+"-"+count);
			}
		}

		System.out.println(count);
	}

}
