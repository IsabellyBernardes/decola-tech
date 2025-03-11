package org.example.model;

import jakarta.persistence.*;

@Entity(name = "tb_Tarefas")
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @Column(unique = true)
    private String titulo;

    @OneToOne(cascade = CascadeType.ALL)
    private String descricao;

    @OneToOne(cascade = CascadeType.ALL)
    private String categoria;

    @OneToOne(cascade = CascadeType.ALL)
    private Boolean concluida;

    @OneToOne(cascade = CascadeType.ALL)
    private String prioridade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Boolean getConcluida() {
        return concluida;
    }

    public void setConcluida(Boolean concluida) {
        this.concluida = concluida;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }
}
