package com.example.case_md6.controller;

import com.example.case_md6.model.Songs;
import com.example.case_md6.service.ISongsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")

@RequestMapping("/Songs")
public class SongsController {
    @Autowired
    private ISongsService iSongsService;

    @GetMapping("")
    public ResponseEntity<?> showSongs(@RequestParam(defaultValue = "0") int page,
                                       @RequestParam(defaultValue = "") String name) {
        Pageable pageable = PageRequest.of(page, 5);
        Page<Songs> songsList = iSongsService.getAllPage(pageable, name);
        return new ResponseEntity<>(songsList, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> createSongs(@RequestBody Songs songs) {
        iSongsService.save(songs);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> ByIdSongs(@PathVariable Integer id) {
        Songs songs = iSongsService.findById(id);
        return new ResponseEntity<>(songs,HttpStatus.OK);
    }

    @DeleteMapping("remove/{id}")
    public ResponseEntity<?> removesSongs(@PathVariable Integer id) {
        Songs songs = iSongsService.findById(id);
        iSongsService.removeSongs(songs);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}