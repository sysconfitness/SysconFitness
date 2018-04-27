package br.com.sysconFitness.converters;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.sysconFitness.controle.esp.BairroBCI;
import br.com.sysconFitness.model.Bairro;

@FacesConverter("bairroConverter")
public class BairroConverter  implements Converter {
	
		@Autowired
		private BairroBCI controle;

		@Override
		public Object getAsObject(FacesContext context, UIComponent component, String value) {
			if (value == null) {
				return null;
			}
			
			return controle.buscaPeloId(Integer.valueOf(value));
		}

		@Override
		public String getAsString(FacesContext context, UIComponent component, Object value) {
			if (value == null) {
				return null;
			}

			Bairro bairro = (Bairro) value;

			return bairro.getId().toString();
	}


}
