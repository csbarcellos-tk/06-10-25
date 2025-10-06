package com.example.__10_25.Controller;

import com.example.__10_25.Model.Cliente;
import com.example.__10_25.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    // Listar todos os clientes
    @GetMapping
    public List<Cliente> listarClientes() {
        return clienteService.listarClientes();
    }

    // Salvar novo cliente
    @PostMapping
    public Cliente salvarCliente(@RequestBody Cliente cliente) {
        return clienteService.salvarCliente(cliente);
    }

    // Atualizar cliente existente
    @PutMapping("/{id}")
    public Cliente atualizarCliente(@PathVariable UUID id, @RequestBody Cliente cliente) {
        return clienteService.atualizarCliente(id, cliente);
    }

    // Excluir cliente
    @DeleteMapping("/{id}")
    public void excluirCliente(@PathVariable UUID id) {
        clienteService.excluirCliente(id);
    }
}
