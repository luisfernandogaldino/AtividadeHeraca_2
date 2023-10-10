package Heranca;

public class Administrador extends Funcionario{
	private int cra;

	public Administrador(String nome, String matricula, Double salario, String telefone, String endereco,String dataNascimento, int cra) {
		super(nome, matricula, salario, telefone, endereco, dataNascimento);
		this.cra = cra;
	}

	public int getCra() {
		return cra;
	}

	public void setCra(int cra) {
		this.cra = cra;
	}


}

