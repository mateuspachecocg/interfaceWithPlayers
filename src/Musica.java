
public class Musica {

	private String nome;
	private int duracao;

	public Musica(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}
	
	public int getDuracao() {
		return this.duracao;
	}

	public void setDuracao(int duracao) {
		if (duracao >= 0)
			this.duracao = duracao;
	}
}