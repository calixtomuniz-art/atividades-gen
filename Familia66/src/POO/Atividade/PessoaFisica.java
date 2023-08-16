package POO.Atividade;


public class PessoaFisica extends Cliente{

    private String cpf;

    public PessoaFisica(String nome, Integer idade, String cpf) {
		super(nome, idade);
        this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

    @Override
    public void visualizar(){
        System.out.printf("\nNome: %s \nIdade: %d \nCPF: %s\n", getNome(), getIdade(), getCpf());
    }

}
