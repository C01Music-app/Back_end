package com.example.case_md6.repository.artistsRepository;

import com.example.case_md6.model.Artists;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IArtistsRepository extends JpaRepository<Artists, Integer> {
    List<Artists> findByNameContainingIgnoreCase(String name);
}
