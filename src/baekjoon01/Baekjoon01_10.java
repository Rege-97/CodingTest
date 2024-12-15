package baekjoon01;

import java.util.Scanner;

public class Baekjoon01_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int num2_1 = num2 % 10;
		int num2_10 = (num2 % 100) / 10;
		int num2_100 = num2 / 100;
		
		System.out.println(num1*num2_1);
		System.out.println(num1*num2_10);
		System.out.println(num1*num2_100);
		System.out.println(num1*num2);

	}

}
