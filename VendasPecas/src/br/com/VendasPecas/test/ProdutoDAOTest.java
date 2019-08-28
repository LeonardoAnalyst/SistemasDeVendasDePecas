package br.com.VendasPecas.test;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Test;

import br.com.VendasPecas.DAO.FornecedoresDAO;
import br.com.VendasPecas.DAO.ProdutosDAO;
import br.com.VendasPecas.domain.Fornecedor;
import br.com.VendasPecas.domain.Produto;

public class ProdutoDAOTest {
	@Test
	@org.junit.Ignore
	public void salvar() {
		FornecedoresDAO dao = new FornecedoresDAO();
		Fornecedor fornecedor = dao.buscarPorCodigo(13L); // corresponde a este fornecedor
		Produto f1 = new Produto();
		f1.setDescricao("Feijao");
		f1.setPreco(new BigDecimal(14.99D));
		f1.setFornecedor(fornecedor);
		f1.setQuantidade(10);

		ProdutosDAO produtosdao = new ProdutosDAO();
		produtosdao.salvar(f1);

	}

	@Test
	@org.junit.Ignore
	public void listar() {
		ProdutosDAO dao = new ProdutosDAO();
		List<Produto> produto = dao.listar();
		System.out.println(produto);

	}

	@Test

	public void buscarPorCodigo() {
		ProdutosDAO dao = new ProdutosDAO();
		Produto f1 = dao.buscarPorCodigo(2L);

		System.out.println(f1);

	}

	@Test
	@org.junit.Ignore
	public void excluir() {
		ProdutosDAO dao = new ProdutosDAO();
		Produto produto = dao.buscarPorCodigo(3L);
		dao.excluir(produto);

	}

	@Test
	@org.junit.Ignore
	public void editar() {		
		FornecedoresDAO fdao = new FornecedoresDAO();
		Fornecedor fornecedor = fdao.buscarPorCodigo(9L); // corresponde a este fornecedor para editar
		ProdutosDAO dao = new ProdutosDAO();

		Produto produto = dao.buscarPorCodigo(1L);
		produto.setDescricao("Café");
		produto.setPreco(new BigDecimal(10.99D));
		produto.setQuantidade(45);
		produto.setFornecedor(fornecedor); //edita o fornecedor específico
		

		dao.editar(produto);

	}

}
