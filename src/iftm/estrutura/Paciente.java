package iftm.estrutura;

public class Paciente {

	private String nome;
	private String dataNacimento;
	private String sintomas;
	private String prioridade;

	public Paciente() {
	}

	public Paciente(String nome, String dataNacimento, String sintomas, String prioridade) {
		this.nome = nome;
		this.dataNacimento = dataNacimento;
		this.sintomas = sintomas;
		this.prioridade = prioridade;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNacimento() {
		return dataNacimento;
	}

	public void setDataNacimento(String dataNacimento) {
		this.dataNacimento = dataNacimento;
	}

	public String getSintomas() {
		return sintomas;
	}

	public void setSintoma(String sintomas) {
		this.sintomas = sintomas;
	}

	public String getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}

	@Override
	public String toString() {
		return "Personagem [ nome = " + nome + ", dataNacimento = " + dataNacimento + " ,sintomas = " + sintomas
				+ " ,prioridade = " + prioridade + "]";
	}

}
