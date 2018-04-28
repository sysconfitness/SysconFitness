package br.com.sysconFitness.converters;
import java.io.Serializable;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.sysconFitness.controle.esp.BairroBCI;
import br.com.sysconFitness.controle.impl.BairroBC;
import br.com.sysconFitness.model.Bairro;

@FacesConverter(forClass = Bairro.class)
public class BairroConverter  implements Converter, Serializable{

	private static final long serialVersionUID = 1L;
	@Autowired
	BairroBCI controle = new BairroBC();
		
		@Override
		public Object getAsObject(FacesContext context, UIComponent component, String value) {
			if (value != null && value.trim().length() > 0) {
				return controle.buscaPeloId(Integer.valueOf(value));
			}
			return null;
		}

		@Override
		public String getAsString(FacesContext context, UIComponent component, Object obj) {
			if (obj == null) {
				return null;
			}
			Bairro bairro = (Bairro) obj;
			return bairro.getId().toString();
	}


}
