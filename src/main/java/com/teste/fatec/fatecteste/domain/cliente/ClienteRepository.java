package com.teste.fatec.fatecteste.domain.cliente;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.fatec.fatecteste.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
