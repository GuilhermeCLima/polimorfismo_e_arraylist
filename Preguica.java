package POO3;

public  class Preguica extends Animal {
	private String sobeArvore;
	
	public Preguica (String nome,int idade,String som,String sobeArvore) {
		super(nome,idade,som);
		this.sobeArvore = sobeArvore;
	}

	public String getSobeArvore() {
		return sobeArvore;
	}

	public void setSobeArvore(String sobeArvore) {
		this.sobeArvore = sobeArvore;
	}
}
