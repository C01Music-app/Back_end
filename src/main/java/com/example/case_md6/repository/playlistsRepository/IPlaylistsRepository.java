package com.example.case_md6.repository.playlistsRepository;


import com.example.case_md6.model.Playlists;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPlaylistsRepository extends JpaRepository<Playlists, Integer> {

    @Query(value = " select * from artists where name like :name",
            nativeQuery = true)
    Page<Playlists> findByNamePage(Pageable pageable,@Param("name") String name);

}
