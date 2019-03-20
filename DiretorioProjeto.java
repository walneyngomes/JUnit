package br.com.projetobancoddos2;
import java.util.ArrayList;
import java.util.List;

public class DiretorioProjeto {
	protected ProjetoLTI projetoUm=null;
	protected ProjetoLTI projetoDois=null;

	public DiretorioProjeto(ProjetoLTI saude,ProjetoLTI mobile){
		this.projetoUm=saude;
		this.projetoDois=mobile;
	}
	
	public ProjetoLTI buscarO(String projeto) {
		ProjetoLTI proj = null;
		if (projetoUm.mestreResponsavel.getName().equals(projeto) || "Saude".equals(projeto) || "23/2/2019".equals(projeto)) {
			proj = ProjetoLTISaude.intanceSaude();

		} else if (projetoDois.mestreResponsavel.getName().equals(projeto) || "Mobile".equals(projeto) || "23/12/2019".equals(projeto)) {
			proj = ProjetoLTIMobile.intanceMobile();

		}
		
		
		return  proj;

	}

}
