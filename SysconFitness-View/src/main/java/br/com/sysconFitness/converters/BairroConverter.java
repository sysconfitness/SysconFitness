package br.com.sysconFitness.converters;

import java.io.Serializable;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.sysconFitness.controle.esp.BairroBCI;
import br.com.sysconFitness.model.Bairro;

@FacesConverter("bairroConverter")
public class BairroConverter implements Converter, Serializable{

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private BairroBCI controle;
	
	
	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String value) {
		
		if (value == null) {
			return value;
		}
		
	 return controle.selectId(Integer.valueOf(value));
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		if (value == null) {
			return null;
		}
		Bairro bairro =(Bairro) value;
		return bairro.getId().toString();	
	}
}
	
	
	
	