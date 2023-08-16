package POO.Atividade;

public class TesteCliente {

    public static void main(String[] args) {
		Cliente cliente = null;

        System.out.println("\n ###### Pessoas Físicas ######");
		PessoaFisica pessoaFisicaObj01 = new PessoaFisica("Gael Caleb Levi da Cruz",26,"132.889.360-03");
        cliente = pessoaFisicaObj01;
        cliente.visualizar();

		PessoaFisica pessoaFisicaObj02 = new PessoaFisica("Ricardo Vicente Yago Viana",37,"132.889.360-03");
        cliente = pessoaFisicaObj02;
        cliente.visualizar();
        
        System.out.println("\n###### Pessoas Jurídicas ######");
		PessoaJuridica pessoaJuridicaObj01 = new PessoaJuridica("Luiz Ian Silveira",32,"50.760.149/0001-47");
        cliente = pessoaJuridicaObj01;
        cliente.visualizar();
        
		PessoaJuridica pessoaJuridicaObj02 = new PessoaJuridica("Clara Maria Pires",54,"76.039.588/0001-59");
        cliente = pessoaJuridicaObj02;
        cliente.visualizar();

	}
    
    
}
