package br.com.sysconFitness.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sysconFitness.model.Role;

public interface RoleDaoI extends JpaRepository<Role, Long> {

}
