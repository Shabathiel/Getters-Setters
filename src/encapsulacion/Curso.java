package encapsulacion;

public class Curso {
	private String nombreCurso;
	private int nota1, nota2, nota3;
	
	public Curso(String nombreCurso, int nota1, int nota2, int nota3) {
		this.nombreCurso = nombreCurso;
		if (nota1 >= 0 && nota1 <= 100) this.nota1 = nota1;
		else this.nota1 = 0;
		if (nota2 >= 0 && nota2 <= 100) this.nota2 = nota2;
		else this.nota2 = 0;
		if (nota3 >= 0 && nota3 <= 100) this.nota3 = nota3;
		else this.nota3 = 0;
	}
	
	public int promedio() {
		return (nota1 + nota2 + nota3) / 3;
	}
	
	public String estado() {
		if (this.promedio() > 60) {
			return "Aprovado";
		}
		return "Reprobado";
	}
}
