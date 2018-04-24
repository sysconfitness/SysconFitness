package br.com.sysconFitness.configuration;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import br.com.sysconFitness.controle.esp.UsuarioBCI;
import br.com.sysconFitness.model.Usuario;


@Repository
@Transactional
@Configuration
public class ImplUserDetailsService implements UserDetailsService {
	
	@Autowired
	UsuarioBCI controle;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Usuario usuario = controle.selectLogin(username);
		
		if(usuario == null) {
			throw new UsernameNotFoundException("Usuario nao encontrado!");
		}
		return new User(usuario.getUsername(), usuario.getPassword(), true, true, true, true, usuario.getAuthorities());
	}
}
