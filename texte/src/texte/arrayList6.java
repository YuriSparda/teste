package texte;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class arrayList6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> num = new ArrayList<Integer>();
		boolean ser� = true;
		while (ser�) {
			System.out.println("digite um novo numero");
			int impuNum = sc.nextInt();
			num.add(impuNum);
			System.out.println("para finalizar aperte n \nx para continuar");
			char resp = sc.next().charAt(0);
			if (resp == 'n') {
				ser� = false;
			}
		}
		int calc=0;
		for (int x : num) {
			calc+=x;
		}
		calc/=num.size();
		System.out.println("resultado final � "+calc);
		int numMax = num.indexOf(Collections.max(num));
		System.out.println("numero maior � " + (1+numMax));
		int numMin = num.indexOf(Collections.min(num));
		System.out.println("numero menor � " + (1+numMin));
		sc.close();
		System.err.println("fim.");
	}

}
