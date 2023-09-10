package rafael.cunha.estudo;

import java.util.Scanner;


public class JovemInformatico {
	
	static Scanner input = new Scanner(System.in);

	
	public static void Jovem() {
		System.out.println("Tem entre 20 e 30 anos.");
		
	}
	
	public static void Emprego() {
		System.out.println("Trabalha na área de IT.");

	}
	
	public static void Montante() {
		System.out.println("Qual o curso que quer seguir?");
		String Curso = input.nextLine();
		System.out.println("O curso que quer seguir é: " + Curso);
		
		
		
	}

}

