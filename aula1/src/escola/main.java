package escola;

public class main {

	public static void main(String[] args) {
		Professor Felipe = new Professor();
		Felipe.setNomedoUsuario("Felipe Santos");
		Felipe.setCpf("028890272-60");
		Felipe.setIdade(25);
		
		
		Aluno Kirk = new Aluno();
		Aluno Bessa = new Aluno();
		
		Kirk.setNomedoUsuario("Kirk Douglas");
		Kirk.setNotaMatematica(7);
		Kirk.setNotaPortugues(8);
		Kirk.setNotaHistoria(7);
		Kirk.setNotaGeografia(7);
		Kirk.setNotaLiteratura(5);
		
		Bessa.setNomedoUsuario("Diego Bessa");
		Bessa.setNotaMatematica(-2);
		Bessa.setNotaPortugues(1);
		Bessa.setNotaHistoria(5);
		Bessa.setNotaGeografia(0);
		Bessa.setNotaLiteratura(10);
		
		System.out.println("NOTAS DO KIRK DOUGLAS");
		System.out.println("Matemática: " + Kirk.getNotaMatematica());
		System.out.println("Português: " + Kirk.getNotaPortugues());
		System.out.println("História: " + Kirk.getNotaHistoria());
		System.out.println("Geografia: " + Kirk.getNotaGeografia());
		System.out.println("Literatura: " + Kirk.getNotaLiteratura());
		
		System.out.println("\n");
		
		System.out.println("NOTAS DO DIEGO BESSA");
		System.out.println("Matemática: " + Bessa.getNotaMatematica());
		System.out.println("Português: " + Bessa.getNotaPortugues());
		System.out.println("História: " + Bessa.getNotaHistoria());
		System.out.println("Geografia: " + Bessa.getNotaGeografia());
		System.out.println("Literatura: " + Bessa.getNotaLiteratura());
		
		
		
		


	}

}
