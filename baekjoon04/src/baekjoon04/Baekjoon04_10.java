package baekjoon04;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon04_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		double arr[] = new double[a];

		for (int i = 0; i < a; i++) {
			arr[i] = sc.nextDouble();
		}
		Arrays.sort(arr);

		for (int i = 0; i < a; i++) {
			arr[i] = (arr[i] / arr[a - 1]) * 100;
		}
		double sum = 0;
		for (int i = 0; i < a; i++) {
			sum += arr[i];
		}
		double avg = sum / (double)a;

		System.out.println(avg);

	}

}
