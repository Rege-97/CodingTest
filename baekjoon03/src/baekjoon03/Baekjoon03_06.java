package baekjoon03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjoon03_06 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int cas = Integer.parseInt(st.nextToken());
		int num1 =0;
		int num2=0;
		for (int i = 1; i <= cas; i++) {
			st = new StringTokenizer(br.readLine()," ");	// 재사용 불가 다시 초기화
			num1=Integer.parseInt(st.nextToken());
			num2=Integer.parseInt(st.nextToken());
			bw.write(num1+num2+"\n");	// char타입으로 입력을 받기에 \n을 붙여서 문자열로 만들어줌
		}
		bw.flush();
		bw.close();

	}

}
