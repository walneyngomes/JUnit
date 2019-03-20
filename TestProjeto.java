package br.com.projetobancoddos2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestProjeto {
	Aluno aluno = null;
	Professor professor = null;
	DiretorioProjeto diretorio = null;

	@Before
	public void instanceAluno() {
		aluno = new Aluno();
	}

	@Before
	public void instanceProfessor() {
		professor = new Professor();
	}

	@Test
	public void testAluno() {

		aluno.setNome("Silvan");
		assertEquals("Silvan", aluno.getNome());
		aluno.setCpf("2222");
		assertEquals("2222", aluno.getCpf());
		aluno.setMatricula("12130922");
		assertEquals("12130922", aluno.getMatricula());
		aluno.setPeriodo(4);
		assertEquals(4, aluno.getPeriodo());

	}

	@Test
	public void testProfessor() {
		ProjetoLTI projeto = ProjetoLTISaude.intanceSaude();
		professor.setCpf("2323");
		professor.setName("Hilton");
		professor.setProj(projeto);
		assertEquals("Hilton", professor.getName());
		assertEquals("2323", professor.getCpf());
		assertEquals(projeto, professor.getProj());

	}

	@Test(expected = Exception.class)
	public void testProjetoProfessorComUm() throws proException {
		ProjetoLTI projeto = ProjetoLTISaude.intanceSaude();
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();

		Professor prof = new Professor();
		prof.setName("Hilton");
		projeto.addstudy(aluno1);
		projeto.addstudy(aluno2);
		projeto.addProfessor(prof);
		DiretorioProjeto d = new DiretorioProjeto(projeto, projeto);
		assertEquals("Hilton", d.buscarO("Hilton").mestreResponsavel.nome);

		Professor prof1 = new Professor();
		prof.setName("YESHUA");
		projeto.addstudy(aluno1);
		projeto.addstudy(aluno2);
		projeto.addProfessor(prof);
		DiretorioProjeto d1 = new DiretorioProjeto(projeto, projeto);
		assertEquals("YESHUA", d1.buscarO("YESHUA").mestreResponsavel.nome);

	}

	@Test(expected = Exception.class)
	public void testProfessorComDoisProjeto() throws proException {
		ProjetoLTI projeto = ProjetoLTISaude.intanceSaude();
		ProjetoLTI projeto1 = ProjetoLTIMobile.intanceMobile();

		Professor prof = new Professor();
		prof.setName("Thais");

		projeto.addProfessor(prof);
		projeto1.addProfessor(prof);
		DiretorioProjeto d1 = new DiretorioProjeto(projeto, projeto1);

		assertEquals(null, d1.buscarO(null).mestreResponsavel.getName());

	}

	@Test(expected = Exception.class)
	public void testAlunoNoTerceiroPerido() throws proException {
		ProjetoLTI projeto = ProjetoLTISaude.intanceSaude();
		Aluno aluno = new Aluno();
		aluno.setPeriodo(2);
		projeto.addstudy(aluno);

	}
	@Test(expected = Exception.class)
	public void testAlunoNaoMatriculado() throws proException{
		Aluno aluno1= new Aluno();
		aluno.setNome("GEL");
		aluno.setMatricula(null);
		
		ProjetoLTI projeto= ProjetoLTISaude.intanceSaude();
		projeto.addstudy(aluno1);
		
	}

	@Test
	public void testAlunoNoQuartoPeriodo() throws proException {
		ProjetoLTI projeto = ProjetoLTISaude.intanceSaude();
		Aluno aluno = new Aluno();
		aluno.setPeriodo(5);
		aluno.setMatricula("127898787");
		projeto.addstudy(aluno);
		projeto.addstudy(aluno);

		assertEquals(2, projeto.quantidade());

	}

	@Test
	public void testBuscarPorNomeDoResponsavel() throws proException {
		ProjetoLTI mobilev = ProjetoLTIMobile.intanceMobile();
		ProjetoLTI saude = ProjetoLTISaude.intanceSaude();

		Professor professor = new Professor();
		Professor professor1 = new Professor();
		professor.setName("JOAQUIM");
		professor1.setName("madruga");

		mobilev.addProfessor(professor);

		saude.addProfessor(professor1);

		DiretorioProjeto projetos = new DiretorioProjeto(saude, mobilev);

		assertEquals("JOAQUIM", projetos.buscarO("JOAQUIM").mestreResponsavel.getName());

	} 
	
	

}
