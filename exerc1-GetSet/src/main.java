import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		infos Prod[] = new infos[5];
		Prod[0] = new infos(0, "a", 0);
		Prod[1] = new infos(0, "b", 0);
		Prod[2] = new infos(0, "c", 0);
		Prod[3] = new infos(0, "d", 0);
		Prod[4] = new infos(0, "a", 0);
		for (int i = 0; i < 5; i++) {
			Prod[i].setID(i);
			System.out.print("escreva o nome do produto " + (i + 1) + " : ");
			String Nome = sc.next();
			Prod[i].setName(Nome);
			System.out.print("qual a quantidade do produto " + (i + 1) + " : ");
			int quant = sc.nextInt();
			Prod[i].setQuantity(quant);

		}
		System.out.println("Deseja ver os produtor?\nY para continuar\nN para parar");
		char Type = sc.next().charAt(0);
		boolean Resp = true;

		if (Type == 'N') {
			Resp = false;
		}
			while (Resp) {
				System.out.println("digite o ID do item que deseja acessar");
				int id = sc.nextInt();
				System.out.printf("produto do id %d \nNome do produto � %s \nQuantidade do produto � %d\n" , id , Prod[id-1].getName(),Prod[id-1].getQuantity());
				System.out.println("Y para continuar\nN para parar");
				Type = sc.next().charAt(0);

				if (Type == 'N') {
					Resp = false;
				}
			System.err.println("FIM.");
		}
	}
}
