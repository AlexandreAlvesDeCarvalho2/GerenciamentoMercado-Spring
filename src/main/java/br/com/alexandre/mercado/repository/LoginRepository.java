package br.com.alexandre.mercado.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alexandre.mercado.model.Login;

public interface LoginRepository extends JpaRepository<Login,Long> {
    
}
