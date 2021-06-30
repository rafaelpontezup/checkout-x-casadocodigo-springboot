package br.com.zup.edu.casadocodigo.categorias;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;

public class NovaCategoria {

    private String nome;

    /**
     * Necessario usar @JsonCreator quando DTO tem um construtor
     * recebendo um único parâmetro do tipo String
     */
    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public NovaCategoria(String nome) { // um unico campo do tipo String
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

}
