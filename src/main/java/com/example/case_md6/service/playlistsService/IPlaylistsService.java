package com.example.case_md6.service.playlistsService;

import com.example.case_md6.model.Playlists;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface IPlaylistsService {

    List<Playlists> getAllPlaylists();

    Playlists savePlaylist(Playlists playlist);

    Optional<Playlists> getPlaylistById(Integer id);

    void deletePlaylist(Integer id);


//    Page<Playlists> findPlaylistsByTitle(Pageable pageable, String name);

    List<Playlists> findPlayListByName(String name);
}
