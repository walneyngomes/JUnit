package br.com.projetobancoddos2;

public class Professor extends Pessoa {
	private String name;
	ProjetoLTI proj = null;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ProjetoLTI getProj() {
		return proj;
	}

	public void setProj(ProjetoLTI proj) {
		this.proj = proj;
	}

}
