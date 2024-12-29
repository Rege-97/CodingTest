package baekjoon08;

import java.io.*;

public class Baekjoon08_03 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());

		for (int i = 0; i < num; i++) {
			int money = Integer.parseInt(br.readLine());

			int qu = money / 25;
			money %= 25;
			int di = money / 10;
			money %= 10;
			int ni = money / 5;
			money %= 5;
			int pe = money / 1;
			
			bw.write(qu+" "+di+" "+ni+" "+pe+"\n");
			

		}

		bw.flush();
		bw.close();
	}

}
