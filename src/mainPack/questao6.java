package mainPack;

import java.util.Scanner;

public class questao6 {

	public static void main(String[] args) {
		int vetorA[] = new int [6];
		int vetorB[] = new int [6];
		int iA, iB = 0;
		Scanner leia = new Scanner(System.in);
		
		for(iA=0; iA<6; iA++) {
			System.out.println("Informe um valor");
			vetorA[iA] = leia.nextInt();
			
			if(vetorA[iA] %2 == 0) {
				vetorB[iA] = 1;
			}
			else {
				vetorB[iA] = 0;
			}
		}
		System.out.println(vetorB[0] + "" + vetorB[1] + "" + vetorB[2] + "" + vetorB[3]  + "" + vetorB[4] + "" + vetorB[5] );
	}

}
