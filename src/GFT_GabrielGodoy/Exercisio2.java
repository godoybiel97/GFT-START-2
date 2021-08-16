package GFT_GabrielGodoy;

import java.util.Scanner;

public class Exercisio2 {
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);

			float percentagemFaixaEtaria1;
			float percentagemFaixaEtaria5;

			int cont = 1;
			double salario;
			double salarioAumento=0;



			
				System.out.println("Digite uma salario");
				salario = entrada.nextInt();

				if ((salario < 1600)) {
					salarioAumento = salario *0.25;

				}
				if ((salario >= 1600) && (salario < 3000)) {
					salarioAumento = salario *0.20;

				}
				if ((salario >= 3000) && (salario < 5000)) {
					salarioAumento = salario *0.15;

				}
				if ((salario >= 5000)) {
					 salarioAumento = salario *0.1;

				}

	 double Novosalario= salario+salarioAumento;
			System.out.println("O porcentual do aumento para salarios ate 1600 é: 25%" + "\n"
					+ "O porcentual do aumento para salarios de 1600 ate 3000 é: 20%" + "\n"+
					"O porcentual do aumento para salarios maiores que 3000 ate 5000 é: 15%" + "\n"
					+"O porcentual do aumento para salarios maiores que 5000 é: 10%"); 

			System.out.println("O aumento no salario foi de: " +salarioAumento );
			System.out.println("O salario antigo era de: " +salario);
			System.out.println("Novo salario: " +Novosalario);
		}
	}


}
