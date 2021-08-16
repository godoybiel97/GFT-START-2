package GFT_GabrielGodoy;

import java.util.Scanner;

public class Exercicio1 {


		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);

			float percentagemFaixaEtaria1;
			float percentagemFaixaEtaria5;

			int idade, cont = 1;

			int faixaetaria1 = 0;
			int faixaetaria2 = 0;
			int faixaetaria3 = 0;
			int faixaetaria4 = 0;
			int faixaetaria5 = 0;

			do {
				System.out.println("Digite uma idade");
				idade = entrada.nextInt();

				if ((idade <= 14)) {
					faixaetaria1++; // conta a qntde de pessoas

				}
				if ((idade >= 15) && (idade <= 29)) {
					faixaetaria2++;

				}
				if ((idade >= 30) && (idade <= 44)) {
					faixaetaria3++;

				}
				if ((idade >= 45) && (idade <= 59)) {
					faixaetaria4++;

				}
				// pessoas com idade maior que 60 anos
				if (idade > 60) {
					faixaetaria5++;
				}

				cont++;
				System.out.println("\n");
			} while (cont <= 10);

			percentagemFaixaEtaria1 = (float) ((faixaetaria1 * 100) / cont);
			percentagemFaixaEtaria5 = (float) ((faixaetaria5 * 100) / cont);
			System.out.println("A percentagem da Primeira faixa etaria é: " + percentagemFaixaEtaria1 + "\n"
					+ "A percentagem da Ultima faixa etaria é: " + percentagemFaixaEtaria5);

			System.out.println("Quantidade de pessoas com idade menor que 14 anos: " + faixaetaria1 + "\n"
					+ "Quantidade de pessoas com idade de 15 ate 29 ano:" + faixaetaria2 + "\n"
					+ "Quantidade de pessoas com idade de 30 ate 44 ano:" + faixaetaria3 + "\n"
					+ "Quantidade de pessoas com idade de 45 ate 59 ano:" + faixaetaria4 + "\n"
					+ "Quantidade de pessoas com idade acima de 60:" + faixaetaria5);
		}
	}


