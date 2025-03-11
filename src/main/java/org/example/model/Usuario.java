package org.example.model;

import jakarta.persistence.*;

@Entity(name = "tb_usuario") //gera o nome da tabela
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER) //quando um usuário é deletado, deleterá em cascata
    private String altaPrioridade;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private String mediaPrioridade;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private String baixaPrioridade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAltaPrioridade() {
        return altaPrioridade;
    }

    public void setAltaPrioridade(String altaPrioridade) {
        this.altaPrioridade = altaPrioridade;
    }

    public String getMediaPrioridade() {
        return mediaPrioridade;
    }

    public void setMediaPrioridade(String mediaPrioridade) {
        this.mediaPrioridade = mediaPrioridade;
    }

    public String getBaixaPrioridade() {
        return baixaPrioridade;
    }

    public void setBaixaPrioridade(String baixaPrioridade) {
        this.baixaPrioridade = baixaPrioridade;
    }
}
