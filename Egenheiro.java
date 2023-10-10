package Heranca;

public class Egenheiro extends Funcionario {
	private int numCrea;

	public Egenheiro(String nome, String matricula, Double salario, String telefone, String endereco,
			String dataNascimento, int numCrea) {
		super(nome, matricula, salario, telefone, endereco, dataNascimento);
		this.numCrea = numCrea;
	}

	public int getNumCrea() {
		return numCrea;
	}

	public void setNumCrea(int numCrea) {
		this.numCrea = numCrea;
	}


}
