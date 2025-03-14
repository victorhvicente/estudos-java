package getset;

//arquivo Escola.java
public class Escola {
	public static void main(String[] args) {
		Aluno victor = new Aluno();
        victor.setNome("Victor Hugo Vicente");
        victor.setIdade(24);

        Aluno mariaJulia = new Aluno();
        mariaJulia.setNome("Maria Julia");
        mariaJulia.setIdade(20);

		
		System.out.println("O aluno " + victor.getNome() + " tem " + victor.getIdade() + " anos ");
        System.out.println("A aluna " + mariaJulia.getNome() + " tem " + mariaJulia.getIdade() + " anos ");	
	}
}