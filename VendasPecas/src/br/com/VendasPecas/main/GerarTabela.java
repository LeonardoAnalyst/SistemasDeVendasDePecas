package br.com.VendasPecas.main;

import br.com.VendasPecas.util.HibernateUtil;

public class GerarTabela {

	public static void main(String[] args) {
		
		HibernateUtil.getSessionFactory();
		HibernateUtil.getSessionFactory().close();

	}

}
