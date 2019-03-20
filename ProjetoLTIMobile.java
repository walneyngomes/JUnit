package br.com.projetobancoddos2;

import java.util.Date;

public class ProjetoLTIMobile extends ProjetoLTI {
	private static ProjetoLTI mobile;

	public static ProjetoLTI intanceMobile() {
		if (mobile==null) {
			mobile = new ProjetoLTIMobile();
		}
		return mobile;
	}

	private ProjetoLTIMobile() {

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
}
