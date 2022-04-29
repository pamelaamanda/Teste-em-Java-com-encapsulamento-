
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 23456);

		System.out.println(conta.getNumero());

		Cliente Pamela = new Cliente();
		Pamela.setNome("Pamela Amanda");

		conta.setTitular(Pamela);
		System.out.println(conta.getTitular().getNome());

		conta.getTitular().setProfissão("Analista de testes");
		System.out.println(conta.getTitular().getProfissão());
	}
}
