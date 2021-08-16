package GFT_GabrielGodoy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner (System.in);
		
	char opcao;
		
	System.out.println("Informe - nos em qual turno você trabalha.");
	System.out.println(" ________________ ");
	System.out.println("|      MENU      |");
	System.out.println("|--- M - Manhã --|");
	System.out.println("|--- T - Tarde --|");
	System.out.println("|--- N - Noite --|");
	System.out.println("|________________|");
	
	opcao = entrada.next().charAt(0);
	
	if (opcao == 'M' || opcao == 'M') {
		System.out.println("Bom dia!");
	}
	
	else if (opcao == 'T' || opcao == 'T') {
		System.out.println("Boa tarde !");	
	}
	
	else if (opcao == 'N' || opcao == 'N') {
		System.out.println("Boa noite !");
	}
	
	else {
		System.out.println("Valor inválido !");
	}
	
	}

}
