package br.com.VendasPecas.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.VendasPecas.DAO.FornecedoresDAO;
import br.com.VendasPecas.domain.Fornecedor;

@FacesConverter("fornecedoresConverter")
public class FornecedoresConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent componente, String valor) {
		try{
			
			Long codigo = Long.parseLong(valor);
			FornecedoresDAO dao = new FornecedoresDAO();
			Fornecedor fornecedor =  dao.buscarPorCodigo(codigo);
			
			return fornecedor;
			
		}catch(RuntimeException ex){
			return null;
		}
		
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent componente, Object objeto) {
		
try{
	
	Fornecedor fornecedor = (Fornecedor) objeto;
	Long codigo = fornecedor.getCodigo();
	return codigo.toString();
	
		}catch(RuntimeException ex){
			return null;
		}
	}

}
