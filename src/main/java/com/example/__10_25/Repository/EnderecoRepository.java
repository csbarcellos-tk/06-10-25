package com.example.__10_25.Repository;

import com.example.__10_25.Model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface EnderecoRepository extends JpaRepository<Endereco, UUID> {
    Optional<Endereco> findByCep(String cep);
}
