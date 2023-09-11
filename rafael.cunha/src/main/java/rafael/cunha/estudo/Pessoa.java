package rafael.cunha.estudo;

public class Pessoa extends JovemInformatico {
	
public String nome;
public int idade;
public int reforma;
	
	public String getNome() {
		return nome;
	}
	
	
	public void setNome (String seuNome) {
		this.nome = seuNome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	
	public void setIdade (int suaIdade) {
		this.idade = suaIdade;
		
	}
	
	public int getReforma() {
		return reforma;
	}
	
	public void setReforma (int idadeReforma) {
		this.reforma = idadeReforma;
	}
		
	
	

}
