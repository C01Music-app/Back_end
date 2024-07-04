package com.example.case_md6.controller;


import com.example.case_md6.model.Artists;
import com.example.case_md6.service.aristsService.IArtistsService;
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
@RequestMapping("/Artists")
public class ArtistsController {

    @Autowired
    private IArtistsService artistsService;

    // Hiển thị tất cả nghệ sĩ
    @GetMapping("")
    public ResponseEntity<List<Artists>> getAllArtists() {
        List<Artists> artists = artistsService.getAllArtists();
        return new ResponseEntity<>(artists, HttpStatus.OK);
    }

    // Tạo nghệ sĩ mới
    @PostMapping("/create")
    public ResponseEntity<Artists> createArtist(@RequestBody Artists artist) {
        Artists savedArtist = artistsService.saveArtist(artist);
        return new ResponseEntity<>(savedArtist, HttpStatus.CREATED);
    }

    // Lấy nghệ sĩ theo ID
    @GetMapping("/{id}")
    public ResponseEntity<Artists> getArtistById(@PathVariable Integer id) {
        Artists artist = artistsService.getArtistById(id);
        return new ResponseEntity<>(artist, HttpStatus.OK);
    }

    // Xóa nghệ sĩ theo ID
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteArtist(@PathVariable Integer id) {
        artistsService.deleteArtist(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    // Tìm kiếm nghệ sĩ theo tên
    @GetMapping("/search")
    public ResponseEntity<?> searchArtistsByName(@RequestParam(defaultValue = "0") int page,
                                                 @RequestParam(defaultValue = "") String name) {
        Pageable pageable = PageRequest.of(page, 5);
        Page<Artists> artists = artistsService.findArtistsByName(pageable,name);
        return new ResponseEntity<>(artists, HttpStatus.OK);
    }
}
