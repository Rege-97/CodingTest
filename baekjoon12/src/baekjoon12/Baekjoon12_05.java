package baekjoon12;

import java.util.Scanner;

public class Baekjoon12_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int six=0;
		int count=0;
		
		while(true) {
			String str=six+"";
			if(str.contains("666")) {
				count++;
			}
			if(num==count) {
				break;
			}
			six++;
		}
		System.out.println(six);

	}

}
