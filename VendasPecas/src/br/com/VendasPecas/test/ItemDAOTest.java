package br.com.VendasPecas.test;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Test;

import br.com.VendasPecas.DAO.ItemDAO;
import br.com.VendasPecas.DAO.ProdutosDAO;
import br.com.VendasPecas.DAO.VendasDAO;
import br.com.VendasPecas.domain.Item;
import br.com.VendasPecas.domain.Produto;
import br.com.VendasPecas.domain.Vendas;

public class ItemDAOTest {
	@Test
	@org.junit.Ignore
	public void salvar() {
		ProdutosDAO pdao = new ProdutosDAO();
		Produto produto = pdao.buscarPorCodigo(1L); // corresponde a este fornecedor

		VendasDAO dao = new VendasDAO();
		Vendas vendas = dao.buscarPorCodigo(3L);
		Item f1 = new Item();
		
		f1.setQuantidade(2);
		f1.setValor_parcial(new BigDecimal(18.99D));
		f1.setProduto(produto);
		f1.setVenda(vendas);

		ItemDAO itedao = new ItemDAO();
		itedao.salvar(f1);

	}

	@Test
	@org.junit.Ignore
	public void listar() {
		ItemDAO dao = new ItemDAO();
		List<Item> item = dao.listar();
		System.out.println(item);

	}

	@Test
	@org.junit.Ignore
	public void buscarPorCodigo() {
		ItemDAO dao = new ItemDAO();
		Item f1 = dao.buscarPorCodigo(2L);

		System.out.println(f1);

	}

	@Test
	@org.junit.Ignore
	public void excluir() {
		ItemDAO dao = new ItemDAO();
		Item item = dao.buscarPorCodigo(2L);
		dao.excluir(item);

	}

	@Test
	
	public void editar() {
		ProdutosDAO pdao = new ProdutosDAO();
		Produto produto = pdao.buscarPorCodigo(4L); // corresponde a este fornecedor

		VendasDAO vdao = new VendasDAO();
		Vendas vendas = vdao.buscarPorCodigo(1L);
		
		ItemDAO dao = new ItemDAO();

		Item item = dao.buscarPorCodigo(1L);
		item.setQuantidade(10);
		item.setValor_parcial(new BigDecimal(10.99));
		item.setProduto(produto);
		item.setVenda(vendas);
		dao.editar(item);

	}

}
