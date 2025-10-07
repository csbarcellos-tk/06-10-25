package com.example.__10_25.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tab_enderecos")

public class Endereco {
    @Id @GeneratedValue
    private UUID id;

@Column(nullable = false)
    private String rua;

@Column(nullable = false)
    private String cidade;

@Column(nullable = false)
    private String uf;

@Column(nullable = false)
    private String cep;

@Column(nullable = false)
    private String numero;

@Column(nullable = false)
    private String logradouro;

    public Endereco(String rua, String cidade, String uf, String cep, String numero, String logradouro) {
        this.rua = rua;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.numero = numero;
        this.logradouro = logradouro;
    }

}
