package texte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arrayList7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Double> num = new ArrayList<Double>();
		List<Double> numPar = new ArrayList<Double>();
		List<Double> numImpar = new ArrayList<Double>();

		for (int i = 0; i < 12; i++) {
			System.out.println("digite o " + i + "� numero da lista");
			int h = sc.nextInt();
			num.add((double) h);
		}

		for (Double x : num) {

			if (x % 2 == 0) {
				numPar.add(x + (x * 0.02));
			} else {
				numImpar.add(x + (x * 0.05));

			}
		}
		for (Double x : numImpar) {
			System.out.printf("impar %.3f \n", x);

		}
		System.out.println("-----------------------");
		for (Double x : numPar) {

			System.out.printf("Pares %.3f\n", x);
		}

		sc.close();
	}

}
