package br.com.projetobancoddos2;

import java.util.ArrayList;
import java.util.Date;

public abstract class ProjetoLTI {

	public static final int PERIODO_MAX = 4;
	public ArrayList<Aluno> grupoDestudys = new ArrayList<Aluno>();
	public Professor mestreResponsavel;
	public Date dataInicio;
	public Date dataConclusao;
	public EnumArea area;
	public String descricao;
	public String titulo;

	

	public abstract  void addProfessor(Professor prof) throws proException; 
	public abstract void addstudy(Aluno study)throws proException ;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Professor getNomeResponsavel() {
		return mestreResponsavel;
	}

	public void setNomeResponsavel(Professor nomeResponsavel) {
		this.mestreResponsavel = nomeResponsavel;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataConclusao() {
		return dataConclusao;
	}

	public void setDataConclusao(Date dataConclusao) {
		this.dataConclusao = dataConclusao;
	}

	public EnumArea getArea() {
		return area;
	}

	public void setArea(EnumArea area) {
		this.area = area;
	}
	public int quantidade(){
		return grupoDestudys.size();
	}
}
