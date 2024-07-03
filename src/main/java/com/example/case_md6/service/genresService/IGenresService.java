package com.example.case_md6.service.genresService;

import com.example.case_md6.model.Genres;
import java.util.List;
import java.util.Optional;

public interface IGenresService {
    Genres saveGenre(Genres genre);
    List<Genres> getAllGenres();
    Optional<Genres> getGenreById(Integer id);
    void deleteGenre(Integer id);
    List<Genres> findGenresByName(String name);
}
