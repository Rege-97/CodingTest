package baekjoon12;

import java.io.*;
import java.util.Scanner;

public class Baekjoon12_03 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		
		int x_result =0;
		int y_result=0;

		for (int x = -999; x <= 999; x++) {
			for (int y = -999; y <= 999; y++) {
				if ((a * x) + (b * y) == c && (d * x) + (e * y) == f) {
					x_result=x;
					y_result=y;
					break;
					
				}
			}
		}
		System.out.println(x_result+" "+y_result);
	}

}
