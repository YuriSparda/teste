package semana4;

public class exerc_8 {

	public static void main(String[] args) {
		int hP[][] = new int[5][3];// 3(0=tamanho)(1=quartos) (2= valor)
		// tamanhos
		hP[0][0] = 100;
		hP[1][0] = 120;
		hP[2][0] = 130;
		hP[3][0] = 140;
		hP[4][0] = 150;
		// quartos
		hP[0][1] = 1;
		hP[1][1] = 1;
		hP[2][1] = 2;
		hP[3][1] = 1;
		hP[4][1] = 3;
		// valor
		hP[0][2] = 200000;
		hP[1][2] = 230000;
		hP[2][2] = 500000;
		hP[3][2] = 260000;
		hP[4][2] = 320000;

		for (int i = 0; i < 3; i++) {
			if (i == 0) {
				System.out.println("tamanhos");

			}
			if (i == 1) {
				System.out.println("quartos");

			}
			if (i == 2) {
				System.out.println("valor");

			}
			for (int j = 0; j < 5; j++) {
				System.out.println("casa " + j + " = " + hP[j][i]);
			}
			System.out.println("media de valores =" + ((hP[0][2] + hP[1][2] + hP[2][2] + hP[3][2] + hP[4][2]) / 5));
		}int maior=0;
		for(int i = 0; i < hP.length; i++){
			if(hP[i][2] > maior){ 
				maior = hP[i][1];
			}
			}int menor=maior;
			int x=0;
		System.out.println("maior casa"+maior);
		for (int j = 0; j < hP.length; j++) {
			if(hP[j][2] < menor){
				menor = hP[j][1];
			}
		}
		System.out.println("menor casa"+0);
	}

}
