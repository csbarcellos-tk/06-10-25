package com.example.__10_25.Repository;
import com.example.__10_25.Model.Cliente;
import com.example.__10_25.Model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import java.util.UUID;

import com.example.__10_25.Model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface ClienteRepository extends JpaRepository<Cliente, UUID> {
    Optional<Cliente> findByEmail(String email);
    Optional<Cliente> findByMatricula(String matricula);
}
