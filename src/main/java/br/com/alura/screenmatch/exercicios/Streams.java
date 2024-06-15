package br.com.alura.screenmatch.exercicios;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Streams {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Jacque", "Iasmin", "Paulo", "Rodrigo", "Nico");

        nomes.stream()
                .sorted()
                .limit(3)
                .map(n -> n.toLowerCase())
                .filter(n -> n.startsWith("n"))
                .map(n -> n.toUpperCase())
                .forEach(System.out::println);
    }
}
