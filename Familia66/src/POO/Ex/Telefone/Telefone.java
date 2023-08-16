package POO.Ex.Telefone;

public abstract class Telefone {
	
	private String tipo;
	
	abstract public void disca(String numero);
	abstract public void toca(int numToques);
	
	public Telefone(String tipo) {
		super();
		this.tipo = tipo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	

}
