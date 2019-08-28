package br.com.VendasPecas.test;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import br.com.VendasPecas.DAO.FuncionariosDAO;
import br.com.VendasPecas.DAO.VendasDAO;
import br.com.VendasPecas.domain.Funcionario;
import br.com.VendasPecas.domain.Vendas;

public class VendasDAOTest {
	@Test
	@org.junit.Ignore
	public void salvar() {
		FuncionariosDAO dao = new FuncionariosDAO();
		Funcionario funcionario = dao.buscarPorCodigo(2L);
		Vendas f1 = new Vendas();

		f1.setHorario(new Date());
		f1.setValor_total(new BigDecimal(70.00D));
		f1.setFuncionario(funcionario);
		VendasDAO vendasdao = new VendasDAO();
		vendasdao.salvar(f1);

	}

	@Test
	@org.junit.Ignore
	public void listar() {
		VendasDAO dao = new VendasDAO();
		List<Vendas> vendas = dao.listar();
		System.out.println(vendas);

	}

	@Test
	@org.junit.Ignore
	public void buscarPorCodigo() {
		VendasDAO dao = new VendasDAO();
		Vendas f1 = dao.buscarPorCodigo(4L);

		System.out.println(f1);

	}

	@Test
	@org.junit.Ignore
	public void excluir() {
		VendasDAO dao = new VendasDAO();
		Vendas produto = dao.buscarPorCodigo(4L);
		dao.excluir(produto);

	}

	@Test
	
	public void editar() {
		FuncionariosDAO fdao = new FuncionariosDAO();
		Funcionario funcionario = fdao.buscarPorCodigo(2L);
		
		VendasDAO dao = new VendasDAO();
		Vendas f1 = dao.buscarPorCodigo(3L);

		f1.setHorario(new Date());
		f1.setValor_total(new BigDecimal(20.00D));
		f1.setFuncionario(funcionario);

		dao.editar(f1);

	}

}
