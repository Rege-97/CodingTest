package baekjoon00;

import java.io.*;
import java.util.*;

public class B2798 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		int result = Integer.parseInt(st.nextToken());
		int count = 0;
		int card[] = new int[num];
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < num; i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < num; i++) {
			for (int j = i + 1; j < num; j++) {
				for (int z = j + 1; z < num; z++) {
					count++;
				}
			}
		}

		int arr[] = new int[count];
		count = 0;

		for (int i = 0; i < num; i++) {
			for (int j = i + 1; j < num; j++) {
				for (int z = j + 1; z < num; z++) {
					arr[count] = card[i] + card[j] + card[z];

					count++;
				}
			}
		}

		Arrays.sort(arr);

		int a = 0;
		for (int i = 0; i < count; i++) {
			if (arr[i] >= result) {
				if (arr[i] == result) {
					a = arr[i];
					break;
				} else {
					a = arr[i - 1];
					break;
				}
			}
		}

		if (a == 0) {
			a = arr[count - 1];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(a);

	}

}
