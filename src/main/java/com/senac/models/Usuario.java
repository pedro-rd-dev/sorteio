package com.senac.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Usuario {
    private String nome;
    private List<Integer> numerosEscolhidos;
    private int quantidadeNumerosAcertados;

    public Usuario(String nome, int i, int i1, int i2) {
        this.nome = nome;

        this.numerosEscolhidos = new ArrayList<>();
        this.numerosEscolhidos.add(i);
        this.numerosEscolhidos.add(i1);
        this.numerosEscolhidos.add(i2);
    }
}
