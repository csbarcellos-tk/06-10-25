package com.example.__10_25.Service;

import com.example.__10_25.Model.Funcionario;
import com.example.__10_25.Repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;


    public List<Funcionario> listarFuncionarios() {
        return funcionarioRepository.findAll();
    }

    public Funcionario salvarFuncionario(Funcionario funcionario) {
        Optional<Funcionario> existente = funcionarioRepository.findByEmail(funcionario.getEmail());
        if (existente.isPresent()) {
            throw new RuntimeException("Email já cadastrado.");
        }
        return funcionarioRepository.save(funcionario);
    }


    public Funcionario atualizarFuncionario(UUID id, Funcionario funcionario) {
        if (!funcionarioRepository.existsById(id)) {
            throw new RuntimeException("ID não encontrado.");
        }
        funcionario.setId(id);
        return funcionarioRepository.save(funcionario);
    }

    public void deletarFuncionario(UUID id) {
        if (!funcionarioRepository.existsById(id)) {
            throw new RuntimeException("ID não encontrado.");
        }
        funcionarioRepository.deleteById(id);
    }

}
