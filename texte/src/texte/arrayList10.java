package texte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arrayList10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> num1 = new ArrayList<Integer>();
		List<Integer> num2 = new ArrayList<Integer>();
		List<Integer> num3 = new ArrayList<Integer>();
		for (int i = 0; i < 3; i++) {
			System.out.println("numero " + (1 + i) + " da lista 1");
			int imput = sc.nextInt();
			num1.add(imput);
		}
		for (int i = 0; i < 3; i++) {
			System.out.println("numero " + (1 + i) + " da lista 2");
			int imput = sc.nextInt();
			num2.add(imput);
		}
		for (int i = 0; i < 3; i++) {
			System.out.println("numero " + (1 + i) + " da lista 3");
			int imput = sc.nextInt();
			num3.add(imput);
		}
		System.out.println("lista 1 " + num1);
		System.out.println("lista 2 " + num2);
		System.out.println("lista 3 " + num3);
		sc.close();
	}

}
