package com.senac;

import com.senac.models.Sorteio;
import com.senac.models.Usuario;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Usuario> jogadores = new ArrayList<>();

        Usuario max = new Usuario("max", 35, 17, 16);
        Usuario matheus = new Usuario("matheus", 9, 33, 45);
        Usuario adriely = new Usuario("adriely", 3, 14, 10);
        Usuario leo = new Usuario("Leo o BRABO", 15, 11, 34);
        Usuario marcio = new Usuario("Marcio", 23, 47, 37);
        Usuario alex = new Usuario("Alex", 28, 2, 50);
        Usuario bruno = new Usuario("Bruno", 18, 42, 29);
        Usuario junin = new Usuario("Formigao", 7, 22, 27);
        Usuario biel = new Usuario("Biel o cara", 44, 13, 24);
        Usuario vitu = new Usuario("vitu", 15, 5, 36);
        Usuario daniel = new Usuario("Daniel", 20, 25, 30);

        jogadores.add(matheus);
        jogadores.add(adriely);
        jogadores.add(leo);
        jogadores.add(marcio);
        jogadores.add(alex);
        jogadores.add(bruno);
        jogadores.add(junin);
        jogadores.add(biel);
        jogadores.add(max);
        jogadores.add(vitu);
        jogadores.add(daniel);

        //ESTE É O MEU PRIMEIRO COMENTÁRIO
        //TODO EU PRECISO MELHORAR A FORMA COMO CAPTURO ESSES DADOS
        Sorteio sorteio = new Sorteio(jogadores);

        List<Usuario> sortedList = jogadores.stream()
                .sorted(Comparator.comparingInt(Usuario::getQuantidadeNumerosAcertados)
                        .reversed())
                .collect(Collectors.toList());

        System.out.println();

    }
}
