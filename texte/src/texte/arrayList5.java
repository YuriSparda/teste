package texte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arrayList5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> num = new ArrayList<>();
		for (int i = 0; i <= 5; i++) {
			System.out.println("digite o numero a ser incerido no indice " + i);
			int nab = sc.nextInt();
			num.add(nab);
		}
		boolean ser� = true;
		while (ser�) {
			System.out.println("numeros atuais :");
			for (int i = 0; i <= 5; i++) {
				System.out.println("[" + i + "] = " + num.get(i));
			}
			System.out.println("deseja alterar algum indice? \n(Y para continuar)\n(N para encerrar)");
			char resp = sc.next().charAt(0);
			if (resp == 'Y') {
				System.out.println("qual indice deseja alterar ?");
				int choice = sc.nextInt();
				System.out.println("valor atual do indice " + choice + " � :" + num.get(choice)
						+ "\nQual numero vai ser colocado ?");
				int inNum = sc.nextInt();
				num.set(choice, inNum);
			} else if (resp == 'N') {
				ser� = false;
			}
		}
		sc.close();
		System.err.println("Enecerrando...");
	
	}
}
