
import java.lang.Comparable;
public class NotaAluno implements Comparable<NotaAluno>
{
	public int matricula;
	public String nomeAluno;
	public double nota1;
	public double nota2;
	public double nota3;

	public NotaAluno(int matricula, String nomeAluno, double nota1, double nota2, double nota3)
	{
		this.matricula = matricula;
		this.nomeAluno = nomeAluno;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}

	public double media()
	{
		return (nota1+nota2+nota3)/3;
	}

	public String toString()
	{
		return ">>> " + nomeAluno + "\n" + "> Matrícula: " +  matricula + "\n" + "> Média: " + this.media();
	}

	public int compareTo(NotaAluno aluno)
	{
		if(this.media() > aluno.media())
			return 1;

		else if(this.media() < aluno.media())
			return -1;

		else
			return 0;
	}
}