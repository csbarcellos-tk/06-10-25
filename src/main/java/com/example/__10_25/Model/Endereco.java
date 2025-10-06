package com.example.__10_25.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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

    private String rua;
    private String cidade;
    private String uf;
    private String cep;
    private String numero;
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
