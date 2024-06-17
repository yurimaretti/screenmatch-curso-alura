package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie (@JsonAlias("Title") String titulo,
                          @JsonAlias("totalSeasons") Integer totalTemporadas,
                          @JsonAlias("imdbRating") String avaliacao,
                          @JsonAlias("Actors") String atores,
                          @JsonAlias("Genre") String genero,
                          @JsonAlias("Plot") String sinopse,
                          @JsonAlias("Poster") String poster) {

}
