package br.com.sysconFitness.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
@EnableWebSecurity(debug = false)
public class WebApplicationSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {

	private final PasswordEncoder chave = new BCryptPasswordEncoder();
	
	@Autowired
	private ImplUserDetailsService userDetailsService;
		
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.userDetailsService(userDetailsService)
		.passwordEncoder(new BCryptPasswordEncoder());
		
		
		auth.inMemoryAuthentication()
		.withUser("root")
		.password(chave.encode("root"))
		.roles("ADMIN", "ADMINISTRADOR")
		.and().passwordEncoder(chave);
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.formLogin().loginPage("/login.jsf");
		http.formLogin().loginProcessingUrl("/login.jsf");
		http.formLogin().defaultSuccessUrl("/index.jsf");
		http.formLogin().failureUrl("/login.jsf?source=loginError");
		http.formLogin().permitAll();
		http.authorizeRequests().antMatchers("/resources/**", "/javax.faces.resource/**").permitAll();
		http.logout().logoutUrl("/logout").logoutSuccessUrl("/login.jsf?source=logout").permitAll();
		// Para qualquer outra pagina o usuario deve estar apenas autenticado
		http.authorizeRequests().anyRequest().authenticated();
		// Um tipo de autenticacao com token
		http.csrf().disable();
	}
	
	
	
	
}