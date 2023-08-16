package POO.Atividade;

public abstract class Cliente {

    private String nome;
    private Integer idade;

    abstract public void visualizar();

	public Cliente(String nome, Integer idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

    public Integer getIdade() {
		return idade;
	}
	public void setidade(Integer idade) {
		this.idade = idade;
	}
}
