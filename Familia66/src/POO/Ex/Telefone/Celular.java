package POO.Ex.Telefone;

public class Celular extends Telefone{
	
	public Celular() {
		super("Telefone celular");
	}

	@Override
	public void toca(int codigoToque) {
		switch(codigoToque) {
		case 1:
			System.out.println("\nTrimmmmm trimmmmmmm");
			break;
		case 2:
			System.out.println("\nOh Neymar...Oh neymar");
			break;
			default:
				System.out.println("\nain ze da manga...ain ze da manga");
		}
	}
	
	@Override
	public void disca(String numero) {
		System.out.println("\nO número: "+numero+ " é um celular");
	}
}
