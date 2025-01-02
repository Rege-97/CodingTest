package baekjoon00;

import java.io.*;

public class B8958 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());

		for (int i = 1; i <= num; i++) {
			String str = br.readLine();
			int arr[] = new int[str.length()];
			int count = 0;
			int result = 0;

			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == 'O') {
					count++;
					arr[j] = count;
				} else {
					count = 0;
					arr[j] = count;
				}
			}

			for (int j = 0; j < arr.length; j++) {
				result += arr[j];
			}

			bw.write(result + "\n");

		}

		bw.flush();
		bw.close();

	}

}
