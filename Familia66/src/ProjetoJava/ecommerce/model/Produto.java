package ProjetoJava.ecommerce.model;

public abstract class Produto {
    
	private int numIdentificador;
	private String nome;
	private int tipo;
	private float preco;

	public Produto(int numIdentificador, int tipo, String nome, float preco) {
		this.numIdentificador = numIdentificador;
		this.tipo = tipo;
		this.nome = nome;
		this.preco = preco;
	}

	public int getNumIdentificador() {
		return numIdentificador;
	}

	public void setNumIdentificador(int numIdentificador) {
		this.numIdentificador = numIdentificador;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public void visualizar() {

		String tipo = "";
		
		switch(this.tipo) {
			case 1:
				tipo = "Instrumental";
			break;
			case 2:
				tipo = "Serviço";
			break;
		}
		
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do Produto:");
		System.out.println("***********************************************************");
		System.out.println("Número Identificador do Produto: " + this.numIdentificador);
		System.out.println("Tipo do Produto: " + tipo);
		System.out.println("Nome: " + this.nome);
		System.out.println("Preço: " + this.preco);
	}
    
}
