
import java.util.ArrayList;
import java.util.Collections;
public class Main{
	
	public static void main(String [] args){

		NotaAluno aluno1 = new NotaAluno(11111, "Aluno1", 7.0, 3.5, 8.6);
		NotaAluno aluno2 = new NotaAluno(22222, "Aluno2", 7.4, 5.8, 9.0);
		NotaAluno aluno3 = new NotaAluno(33333, "Aluno3", 7.3, 7.4, 7.1);
		NotaAluno aluno4 = new NotaAluno(44444, "Aluno4", 1.0, 10.0, 10.0);
		NotaAluno aluno5 = new NotaAluno(55555, "Aluno5", 3.0, 8.7, 6.5);

		ArrayList<NotaAluno> escola = new ArrayList<NotaAluno>();
		escola.add(aluno1);
		escola.add(aluno2);
		escola.add(aluno3);
		escola.add(aluno4);
		escola.add(aluno5);

		for(NotaAluno aluno : escola){
			System.out.println(aluno);
		}

		System.out.println();
		Collections.sort(escola);
		System.out.println("Depois de usar o sort:");
		System.out.println();

		for(NotaAluno aluno : escola){
			System.out.println(aluno);
		}

	}

}