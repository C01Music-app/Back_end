package com.example.case_md6.repository.playlistsRepository;


import com.example.case_md6.model.Playlists;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPlaylistsRepository extends JpaRepository<Playlists, Integer> {
    List<Playlists> findByTitleContainingIgnoreCase(String title);
}
