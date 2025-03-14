package construtor;

public class SistemaCadastro {
	public static void main(String[] args) {
		Pessoa victor = new Pessoa("Victor", "111-1111");
		
		victor.setEndereco("RUA DAS MARIAS");
		
		
		System.out.println(victor.getNome() + "-" + victor.getCpf());
	}
}
