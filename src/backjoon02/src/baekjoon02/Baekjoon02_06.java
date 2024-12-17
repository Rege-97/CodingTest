package baekjoon02;

import java.util.Scanner;

public class Baekjoon02_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int hour = sc.nextInt();
		int min = sc.nextInt();
		int time = sc.nextInt();

		int min_1 = min + time;
		int hour_1 = hour;

		if (min_1 >= 60) {
			hour_1 = hour_1 + (min_1 / 60);
			min_1 = min_1 % 60;
		}
		if (hour_1 >= 24) {
			hour_1 = hour_1 % 24;
		}
		System.out.println(hour_1+ " "+min_1);

	}

}
