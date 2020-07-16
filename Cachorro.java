package POO3;

public  class Cachorro extends Animal {
	private String correCao;

	public Cachorro(String nome,int idade,String som,String correCao) {
			super(nome,idade,som);
			this.correCao = correCao;
		}

	public String getCorreCao() {
		return correCao;
	}

	public void setCorreCao(String correCao) {
		this.correCao = correCao;
	}
}