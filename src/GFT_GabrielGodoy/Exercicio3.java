package GFT_GabrielGodoy;

import java.util.ArrayList;

import com.sun.tools.javac.util.List;

public class Exercicio3 {
	
	public abstract class Pessoa {

		public abstract String giria();
	}
	public class Paulista extends Pessoa {

		@Override
		public String giria() {
			return "Balada";
		}
	}
	public class Mineiro extends Pessoa {

		@Override
		public String giria() {
			return "Arredar";
		}
	}
	public class Carioca extends Pessoa {

		@Override
		public String giria() {
			return "Mermão";
		}
	}
	public class Main3 {

		public static void main(String[] args) {
			
			List<Pessoa> pessoas = new ArrayList<>();
			
			Pessoa paulista = new Paulista();
			Pessoa mineiro = new Mineiro();
			Pessoa carioca = new Carioca();
			
			pessoas.add(paulista);
			pessoas.add(mineiro);
			pessoas.add(carioca);
			
			for (Pessoa pessoa : pessoas) {
				System.out.println(pessoa.giria());
			}
		}
	}

}
