
public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 23456);

		System.out.println(conta.getAgencia());

		conta.setAgencia(23456);

		Conta conta2 = new Conta(1337, 23468);
		System.out.println(Conta.getTotal());
	}
}
