package br.com.VendasPecas.test;

import java.util.List;

import org.junit.Test;

import br.com.VendasPecas.DAO.FornecedoresDAO;
import br.com.VendasPecas.domain.Fornecedor;

public class FornecedorDAOTest {

	@Test
	@org.junit.Ignore
	public void salvar() {
		Fornecedor f1 = new Fornecedor();
		Fornecedor f2 = new Fornecedor();
		f1.setDescricao("ZeZe Di Camargo");
		f2.setDescricao("Mauro Tramonte");

		FornecedoresDAO dao = new FornecedoresDAO();

		dao.salvar(f1);
		dao.salvar(f2);
	}

	@Test
	@org.junit.Ignore
	public void listar() {
		FornecedoresDAO dao = new FornecedoresDAO();
		List<Fornecedor> fornecedores = dao.listar();

		for (Fornecedor fornecedor : fornecedores) {
			System.out.println(fornecedor);
		}
	}

	@Test
	@org.junit.Ignore
	public void buscarPorCodigo() {
		FornecedoresDAO dao = new FornecedoresDAO();
		Fornecedor f1 = dao.buscarPorCodigo(2L);
		Fornecedor f2 = dao.buscarPorCodigo(6L);

		System.out.println(f1);
		System.out.println(f2);

	}

	@Test
	@org.junit.Ignore
	public void excluir() {
		FornecedoresDAO dao = new FornecedoresDAO();
		
		Fornecedor fornecedor = dao.buscarPorCodigo(2L);
		
			dao.excluir(fornecedor);
		

	}

	@Test
	
	public void editar() {
            FornecedoresDAO dao = new FornecedoresDAO();
		
		    Fornecedor fornecedor = dao.buscarPorCodigo(13L);
		    fornecedor.setDescricao("Joao De Deus");
		 
			dao.editar(fornecedor);
		

	}
}
