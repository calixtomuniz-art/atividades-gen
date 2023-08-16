package POO.Atividade;


public class PessoaJuridica extends Cliente{

    private String cnpj;

    public PessoaJuridica(String nome, Integer idade, String cnpj) {
		super(nome, idade);
        this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

    @Override
    public void visualizar(){
        System.out.printf("\nNome: %s \nIdade: %d \nCNPJ: %s\n", getNome(), getIdade(), getCnpj());
    }
}
