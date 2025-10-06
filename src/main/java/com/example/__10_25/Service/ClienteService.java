package com.example.__10_25.Service;

import com.example.__10_25.Model.Cliente;
import com.example.__10_25.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    // Listar todos os clientes
    public List<Cliente> listarClientes() {
        return clienteRepository.findAll(); // <-- corrigido
    }

    // Salvar cliente novo
    public Cliente salvarCliente(Cliente cliente) {
        Optional<Cliente> existente = clienteRepository.findByMatricula(cliente.getMatricula()); // <-- corrigido
        if (existente.isPresent()) {
            throw new RuntimeException("Matrícula já cadastrada.");
        }
        return clienteRepository.save(cliente); // <-- corrigido
    }

    // Atualizar cliente existente
    public Cliente atualizarCliente(UUID id, Cliente cliente) {
        if (!clienteRepository.existsById(id)) {
            throw new RuntimeException("ID não encontrado.");
        }
        cliente.setId(id); // garante que o ID correto seja usado
        return clienteRepository.save(cliente); // <-- corrigido
    }

    // Excluir cliente
    public void excluirCliente(UUID id) {
        if (!clienteRepository.existsById(id)) {
            throw new RuntimeException("ID não encontrado.");
        }
        clienteRepository.deleteById(id); // <-- corrigido
    }
}
