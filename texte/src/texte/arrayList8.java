package texte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arrayList8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> num = new ArrayList<>();
		num.add(1);
		num.add(3);
		num.add(5);
		num.add(7);
		num.add(9);
		System.out.println("digite o numero para tentar.");
		boolean resp=true;
		int curre=0;
		int tent = 0;
		while (resp) {tent += 1;
			int imput = sc.nextInt();
			for (Integer x : num) {
				if (imput == x) {
					System.out.println("acertou!!!!");
					resp=false;
					curre=imput;
					break;
				}
				
			}
			System.out.println("foram " + tent + "tentativas ");
		}
		System.out.println("o numero era "+curre);
	sc.close();
	}

}
