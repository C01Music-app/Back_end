package com.example.case_md6.service;

import com.example.case_md6.model.Album;
import com.example.case_md6.model.Songs;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IAlbumService {
    List<Album> getAll();

    Album findById(Integer id);


    void save(Album album);

    void remove(Album album);


    Page<Album> getAllPage(Pageable pageable, String name);

}
