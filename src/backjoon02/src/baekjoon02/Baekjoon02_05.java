package baekjoon02;

import java.util.Scanner;

public class Baekjoon02_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int m = sc.nextInt();

		int m_1 = m - 45;

		if (m_1 < 0) {
			if (h == 0) {
				m_1 = 60 + m_1;
				h = 23;
			} else {
				m_1 = 60 + m_1;
				h = h - 1;
			}
		}
		System.out.println(h + " " + m_1);
	}

}
