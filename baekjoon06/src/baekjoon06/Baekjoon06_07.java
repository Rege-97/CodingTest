package baekjoon06;

import java.io.*;

public class Baekjoon06_07 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		int count = 0;
		int cnt = num;

		while (count != num) {
			String str = br.readLine();
			char arr[] = new char[str.length()];

			for (int i = 0; i < str.length(); i++) {
				arr[i] = str.charAt(i);
			}

			boolean bool = true;
			for (int i = 0; i < arr.length; i++) {
				if (i == arr.length - 1 || bool == false) {
					break;
				}
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] != arr[j]) {
						for (int z = j + 1; z < arr.length; z++) {
							if (arr[i] == arr[z]) {
								cnt--;
								bool = false;
								break;
							}
						}
						break;
					}
				}
			}

			count++;
		}
		System.out.println(cnt);
	}

}
