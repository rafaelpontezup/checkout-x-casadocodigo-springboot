package br.com.zup.edu.casadocodigo.autores;

import java.time.LocalDateTime;

public class NovoAutorResponse {

    private String nome;
    private String email;
    private LocalDateTime criadoEm;

    public NovoAutorResponse(Autor autor) {
        this.nome = autor.getNome();
        this.email = autor.getEmail();
        this.criadoEm = autor.getCriadoEm();
    }

    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

}
