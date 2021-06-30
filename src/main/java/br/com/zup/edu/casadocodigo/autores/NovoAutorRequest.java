package br.com.zup.edu.casadocodigo.autores;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class NovoAutorRequest {

    @NotBlank
    private String nome;
    @NotBlank
    @Email
    private String email;
    @NotBlank
    @Size(max = 400)
    private String descricao;

    public NovoAutorRequest(@NotBlank String nome, @NotBlank @Email String email, @NotBlank @Size(max = 400) String descricao) {
        this.nome = nome;
        this.email = email;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "NovoAutorRequest{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }

    /**
     * Convertendo o DTO para modelo de dominio (vulgo entidade da JPA)
     */
    public Autor toModel() {
        Autor model = new Autor(this.getNome(), this.getEmail(), this.getDescricao());
        return model;
    }
}
