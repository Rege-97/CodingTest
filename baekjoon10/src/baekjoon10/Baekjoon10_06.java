package baekjoon10;

import java.io.*;

public class Baekjoon10_06 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int count = 0;
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		int num3 = Integer.parseInt(br.readLine());

		if (num1 == num2) {
			count++;
		}
		if (num1 == num3) {
			count++;
		}
		if (num2 == num3) {
			count++;
		}

		if (num1 + num2 + num3 == 180) {
			if (count == 3) {
				System.out.println("Equilateral");
			} else if (count == 1) {
				System.out.println("Isosceles");
			} else if (count == 0) {
				System.out.println("Scalene");
			}
		} else {
			System.out.println("Error");
		}

	}

}
