package br.com.VendasPecas.test;

import java.util.List;

import org.junit.Test;

import br.com.VendasPecas.DAO.FuncionariosDAO;
import br.com.VendasPecas.domain.Funcionario;

public class FuncionarioDAOTest {
	@Test
	
	public void salvar() {
		Funcionario f1 = new Funcionario();		
		f1.setNome("Jair Bolsonaro");
		f1.setCpf("23465768238");
		f1.setSenha("123");
		f1.setFuncao("Presidente");

		FuncionariosDAO dao = new FuncionariosDAO();
		dao.salvar(f1);
		
		
	}

	@Test
	@org.junit.Ignore
	public void listar() {
		FuncionariosDAO dao = new FuncionariosDAO();
		List<Funcionario> funcionarios = dao.listar();

		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario);
		}
	}

	@Test
	@org.junit.Ignore
	public void buscarPorCodigo() {
		FuncionariosDAO dao = new FuncionariosDAO();
		Funcionario f1 = dao.buscarPorCodigo(2L);
		Funcionario f2 = dao.buscarPorCodigo(6L);

		System.out.println(f1);
		System.out.println(f2);

	}

	@Test
	@org.junit.Ignore	
	public void excluir() {
		FuncionariosDAO dao = new FuncionariosDAO();

		Funcionario fornecedor = dao.buscarPorCodigo(1L);

		dao.excluir(fornecedor);

	}

	@Test
	@org.junit.Ignore
	public void editar() {
		FuncionariosDAO dao = new FuncionariosDAO();

		Funcionario fornecedor = dao.buscarPorCodigo(2L);
		fornecedor.setNome("Luiz Inácio");
		fornecedor.setCpf("157157157");
		fornecedor.setSenha("157");
		fornecedor.setFuncao("Presidiário");
		
		dao.editar(fornecedor);

	}
}
