package baekjoon02;

import java.util.Scanner;

public class Baekjoon02_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int scope = sc.nextInt();

		if (90 <= scope && scope <= 100) {
			System.out.println("A");
		} else if (80 <= scope && scope < 90) {
			System.out.println("B");
		} else if (70 <= scope && scope < 80) {
			System.out.println("C");
		} else if (60 <= scope && scope < 70) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

	}

}
