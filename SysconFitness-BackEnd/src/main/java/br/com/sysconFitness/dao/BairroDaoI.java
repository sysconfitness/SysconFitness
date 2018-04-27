package br.com.sysconFitness.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sysconFitness.model.Bairro;

public interface BairroDaoI extends JpaRepository<Bairro, Long> {
		public Bairro findById(Integer codigo);
}
