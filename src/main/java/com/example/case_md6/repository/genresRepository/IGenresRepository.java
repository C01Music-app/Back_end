package com.example.case_md6.repository.genresRepository;

import com.example.case_md6.model.Genres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IGenresRepository extends JpaRepository<Genres, Integer> {
    List<Genres> findByNameContainingIgnoreCase(String name);
}
