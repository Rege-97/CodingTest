package baekjoon09;

import java.io.*;

public class Baekjoon09_03 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while (true) {
			int num1 = Integer.parseInt(br.readLine());
			int count = 0;
			int sum = 0;

			if (num1 == -1) {
				break;
			}

			int arr[] = new int[num1];
			for (int i = 1; i <= num1; i++) {
				if (num1 % i == 0) {
					arr[count] = i;
					count++;
				}
			}
			for (int i = 0; i < arr.length; i++) {
				if(arr[i]!=num1) {
				sum += arr[i];
				}
			}
	
			if (sum == num1) {
				bw.write(num1+" = 1");
				for(int i = 1;i<arr.length;i++) {
					if(arr[i]==0) {
						break;
					}else if(arr[i]!=num1) {
						bw.write(" + "+arr[i]);
					}
				}
				bw.write("\n");
			}else {
				bw.write(num1+" is NOT perfect.\n");
			}
		}
		bw.flush();
		bw.close();
	}

}
