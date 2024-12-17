package baekjoon02;

import java.util.Scanner;

public class Baekjoon02_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dice1 = sc.nextInt();
		int dice2 = sc.nextInt();
		int dice3 = sc.nextInt();
		int result = 0;

		if (dice1 == dice2 && dice2 == dice3) {
			result = 10000 + (dice1 * 1000);
		} else if (dice1 == dice2 || dice1 == dice3) {
			result = 1000 + (dice1 * 100);
		} else if (dice2 == dice3) {
			result = 1000 + (dice2 * 100);
		} else {
			if (dice1 > dice2 && dice1 > dice3) {
				result = dice1 * 100;
			} else if (dice2 > dice1 && dice2 > dice3) {
				result = dice2 * 100;
			} else if (dice3 > dice1 && dice3 > dice1) {
				result = dice3 * 100;
			}
		}
		System.out.println(result);
	}

}
