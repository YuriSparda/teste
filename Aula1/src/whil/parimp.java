package whil;

import java.util.Scanner;

public class parimp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("digite o numero");
			int num =sc.nextInt();
			if (num==1||num==3||num==5||num==7||num==9||num==11) {System.out.println(num+ " � par");
				
			}else {
				System.out.println(num+" � impar");
			}
			
		}

	}

}
