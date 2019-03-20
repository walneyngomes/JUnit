package br.com.projetobancoddos2;

import java.util.ArrayList;
import java.util.Date;

public class ProjetoLTISaude extends ProjetoLTI {
	public ArrayList<Aluno> grupoDestudys = new ArrayList<Aluno>();

	private static ProjetoLTI saude;

	public static ProjetoLTI intanceSaude() {
		if (saude==null) {
			saude = new ProjetoLTISaude();
		}
		return saude;
	}

	private ProjetoLTISaude() {
	}

	public void addProfessor(Professor prof) throws proException {
		if (prof.getProj()==null) {
			this.mestreResponsavel = prof;

		}

		else {
			throw new proException("JA TEM um professor responsável." + this.mestreResponsavel.nome);

		}
	}

	public void addstudy(Aluno study) throws proException {
		if ((study.getPeriodo() >= PERIODO_MAX) && !(study.getMatricula().equals(null))) {
			this.grupoDestudys.add(study);
		} else {
			throw new proException(" Verifique se o aluno possui matricula ou esta no 4 periodo");
		}
	}
	public int quantidade(){
		return grupoDestudys.size();
	}

	

}
