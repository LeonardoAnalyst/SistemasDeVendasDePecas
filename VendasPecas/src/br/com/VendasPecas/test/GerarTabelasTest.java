package br.com.VendasPecas.test;

import org.junit.Test;

import br.com.VendasPecas.util.HibernateUtil;

public class GerarTabelasTest {

	@Test
	public void gerar(){
		HibernateUtil.getSessionFactory();
		HibernateUtil.getSessionFactory().close();

	}

}
