package baekjoon00;

import java.io.*;
import java.util.StringTokenizer;

public class B11047 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int num = Integer.parseInt(st.nextToken());
		int money = Integer.parseInt(st.nextToken());
		int arr[] = new int[num];
		int result = 0;
		int money_a = money;

		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		for (int i = num - 1; i >= 0; i--) {
			if (money / arr[i] != 0) {
				result = result + (money_a / arr[i]);
				money_a = money_a % arr[i];
			}
		}

		System.out.println(result);
	}

}
