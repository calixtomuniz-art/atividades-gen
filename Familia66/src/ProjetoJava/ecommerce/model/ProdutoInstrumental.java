package ProjetoJava.ecommerce.model;

public class ProdutoInstrumental extends Produto{

	private String url;

	public ProdutoInstrumental(int numIdentificador, int tipo, String nome, float preco, String url) {
		super(numIdentificador, tipo, nome, preco);
		this.url = url;
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

    @Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Link do Instrumental: " + this.url);
	}
    
}