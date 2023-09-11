package rafael.cunha.estudo;



public class Aplicação {

	public static void main(String[] args) {
		
		Rafael R = new Rafael();
		Antonio A = new Antonio();
		Pessoa P = new Pessoa();
		int reforma = 65;
				
		/*
		R.setNome ("Rafael");
		System.out.println("O seu nome é: " + R.getNome());
		R.Idade();
		R.Jovem();
		R.Emprego();
		R.Montante();
		
		A.Nome();
		A.Idade();
		A.Jovem();
		A.Emprego();
		A.Montante(); 
		*/
		
		P.setNome("Rafa");
		System.out.println("O nome é: " + P.getNome());
		
		P.setIdade(77);		
		//System.out.println("Anos até à reforma: " + (reforma - P.getIdade()));
		
		if (reforma - P.getIdade() <= 0) {
			System.out.println("Já está reformado");
		} else
			System.out.println("Anos até à reforma: " + (reforma - P.getIdade()));
		

		
	}

}
