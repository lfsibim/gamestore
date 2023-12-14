package com.generation.gamestore.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categorias")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Por favor, insira um tipo de categoria!")
    @Size(min = 4, max = 50, message = "O tipo da categoria deve ter no mínimo 4 e no máximo 50 caracteres!")
    @Column(length = 50)
    private String tipo;

    @NotBlank(message = "Por favor, insira a marca do produto!")
    @Size(min = 5, max = 100, message = "A marca do produto deve ter no mínimo 5 e no máximo 100 caracteres!")
    @Column(length = 100)
    private String marca;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
