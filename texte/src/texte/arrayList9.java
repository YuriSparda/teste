package texte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arrayList9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> num = new ArrayList<Integer>();
		for (int i = 0; i < 12; i++) {
			System.out.println("informe o " + (1 + i) + "� valor");
			int imp = sc.nextInt();
			num.add(imp);
		}int numC=0;
		for (Integer x : num) {
			numC+=x;
		}numC/=num.size();
		System.out.println("media de numeros � "+numC);
		for (Integer x : num) {
			if (x>numC) {
				System.out.println(x+" � maior que a media");
			}
		}
		
		sc.close();
	}

}
