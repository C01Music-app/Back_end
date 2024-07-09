package com.example.case_md6.repository;

import com.example.case_md6.model.Artists;
import com.example.case_md6.model.Songs;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISongsRepository extends JpaRepository<Songs, Integer> {


    Page<Songs> findAllByTitleContaining(Pageable pageable, String name);

    List<Songs> findByTitleContainingIgnoreCase(String name);

    @Query(value = " SELECT * FROM songs ORDER BY date_start DESC",
            nativeQuery = true)
    List<Songs> findAllSongs();

//    SELECT id, title, release_date
//    FROM songs
//    ORDER BY release_date DESC;


}
