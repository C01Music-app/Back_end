package com.example.case_md6.service;

import com.example.case_md6.model.Album;

import java.util.List;

public interface IAlbumService {
    List<Album> getAll();

    Album findById(Integer id);


    void save(Album album);

    void remove(Album album);

}
