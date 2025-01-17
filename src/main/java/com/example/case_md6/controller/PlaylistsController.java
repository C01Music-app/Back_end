package com.example.case_md6.controller;


import com.example.case_md6.model.Artists;
import com.example.case_md6.model.Playlists;
import com.example.case_md6.service.playlistsService.IPlaylistsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/playlists")
public class PlaylistsController {

    @Autowired
    private IPlaylistsService playlistsService;

    // Hiển thị tất cả danh sách phát
    @GetMapping("")
    public ResponseEntity<List<Playlists>> getAllPlaylists() {
        List<Playlists> playlists = playlistsService.getAllPlaylists();
        return new ResponseEntity<>(playlists, HttpStatus.OK);
    }

    // Tạo danh sách phát mới
    @PostMapping("/create")
    public ResponseEntity<Playlists> createPlaylist(@RequestBody Playlists playlist) {
        Playlists savedPlaylist = playlistsService.savePlaylist(playlist);
        return new ResponseEntity<>(savedPlaylist, HttpStatus.CREATED);
    }

    // Lấy danh sách phát theo ID
    @GetMapping("/{id}")
    public ResponseEntity<Playlists> getPlaylistById(@PathVariable Integer id) {
        Optional<Playlists> playlist = playlistsService.getPlaylistById(id);
        if (playlist.isPresent()) {
            return new ResponseEntity<>(playlist.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Xóa danh sách phát theo ID
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deletePlaylist(@PathVariable Integer id) {
        Optional<Playlists> playlist = playlistsService.getPlaylistById(id);
        if (playlist.isPresent()) {
            playlistsService.deletePlaylist(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/search")
    public ResponseEntity<List<Playlists>> searchPlayListByName(@RequestParam String name) {
        List<Playlists> playlists = playlistsService.findPlayListByName(name);
        return new ResponseEntity<>(playlists, HttpStatus.OK);
    }
}


