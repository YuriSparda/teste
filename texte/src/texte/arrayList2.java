package texte;

import java.util.ArrayList;
import java.util.List;

public class arrayList2 {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		for (int i = 0; i <= 5; i++) {
			lista.add(i);
			System.out.println(lista.get(i));
		}
		System.out.println("---------------------------------------");
		for (int i = 5; 0 <=i; i--) {
			System.out.println(lista.get(i));
		}

	}

}
