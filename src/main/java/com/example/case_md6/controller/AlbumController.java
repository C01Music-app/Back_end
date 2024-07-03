package com.example.case_md6.controller;

import com.example.case_md6.model.Album;
import com.example.case_md6.service.IAlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/Album")
public class AlbumController {
    @Autowired
    private IAlbumService iAlbumService;

    @GetMapping("")
    public ResponseEntity<?> showAlbum() {
        List<Album> albumList = iAlbumService.getAll();
        System.out.println(albumList);
        return new ResponseEntity<>(albumList, HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> byIdAlbum(@PathVariable Integer id) {
        Album album = iAlbumService.findById(id);
        return new ResponseEntity<>(album, HttpStatus.OK);
    }


    @PostMapping("/create")
    public ResponseEntity<?> createAlbum(@RequestBody Album album) {
        iAlbumService.save(album);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


    @PutMapping("update/{id}")
    public ResponseEntity<?> updateAlbum(@RequestBody Album album, @PathVariable Integer id) {
//        List<Album> albumList = iAlbumService.getAll();
//        for (int i = 0; i < albumList.size(); i++) {
//            if(albumList.get(i).getId().equals(id)){
//
//            }
//        }
//        Album album = iAlbumService.findById(id);
        iAlbumService.save(album);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("Remove/{id}")
    public ResponseEntity<?> removeAlbum(@PathVariable Integer id) {
        Album album = iAlbumService.findById(id);
        iAlbumService.remove(album);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
