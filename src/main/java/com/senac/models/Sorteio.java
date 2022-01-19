package com.senac.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Data
public class Sorteio {
    private List<Integer> numerosSorteados;
    private List<Usuario> vencedores;
    private List<Usuario> jogadores;

    public Sorteio(List<Usuario> jogadores) {
        this.jogadores = jogadores;
        this.gerarNumerosSorteados();
        this.sortear();
        this.determinarVencedores();
    }

    private void determinarVencedores() {
        int maiorNumeroAcertado = 0;
        this.vencedores = new ArrayList<>();
        for (Usuario usuario : jogadores){
            if(maiorNumeroAcertado < usuario.getQuantidadeNumerosAcertados()){
                maiorNumeroAcertado = usuario.getQuantidadeNumerosAcertados();
                vencedores.clear();

                vencedores.add(usuario);
            }
            if(maiorNumeroAcertado == usuario.getQuantidadeNumerosAcertados()){
                maiorNumeroAcertado = usuario.getQuantidadeNumerosAcertados();
                if(!vencedores.contains(usuario)){
                    vencedores.add(usuario);

                }
            }
        }
    }

    private void sortear() {
        for (Usuario jogador : jogadores){
            int contador = 0;
            List<Integer> numerosDoJogador = jogador.getNumerosEscolhidos();
            for (int numero : numerosDoJogador){
                if(numerosSorteados.contains(numero)){
                    contador++;
                }
            }
            jogador.setQuantidadeNumerosAcertados(contador);
        }
    }

    private void gerarNumerosSorteados() {
        this.numerosSorteados = new ArrayList<>();
        int max = 50;
        int min = 0;
        int primeiroNumero = new Random().nextInt(max - min + 1) + min;
        int segundoNumero = new Random().nextInt(max - min + 1) + min;
        int terceiroNumero = new Random().nextInt(max - min + 1) + min;

        numerosSorteados.add(primeiroNumero);
        numerosSorteados.add(segundoNumero);
        numerosSorteados.add(terceiroNumero);



    }
}
