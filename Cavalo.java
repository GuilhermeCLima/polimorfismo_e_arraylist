package POO3;

public class Cavalo extends Animal {
	private String correCavalo;

	public Cavalo(String nome,int idade,String som,String correCavalo) {
		super(nome,idade,som);
		this.correCavalo = correCavalo;
	}

	public String getCorreCavalo() {
		return correCavalo;
	}

	public void setCorreCavalo(String correCavalo) {
		this.correCavalo = correCavalo;
	}

}
