package whil;

import java.util.Scanner;

public class la�osAlt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y;
		int x;
		System.out.println("digite um numero aleatorio de 0 a 10");
		x = 0;

		while (true) {
			y = sc.nextInt();
			if (y == 0) {
				System.out.println("acertou!!!!");
				break;
			} else if (y > 10) {
				System.out.println("numero invalido");

			} else if (true) {
				x++;
				System.out.println("numero de tentativas = " + x);
			}
		}

	}

}
