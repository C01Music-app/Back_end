package com.example.case_md6.service;

import com.example.case_md6.model.Album;
import com.example.case_md6.model.Songs;
import com.example.case_md6.repository.IAlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService implements IAlbumService{
    @Autowired
    private IAlbumRepository iAlbumRepository;

    @Override
    public List<Album> getAll() {
        return iAlbumRepository.findAll();
    }

    @Override
    public Album findById(Integer id) {
        return iAlbumRepository.findById(id).get();
    }

    @Override
    public void save(Album album) {
        iAlbumRepository.save(album);
    }

    @Override
    public void remove(Album album) {
        iAlbumRepository.delete(album);
    }

    @Override
    public Page<Album> getAllPage(Pageable pageable, String name) {
        return iAlbumRepository.findAllByTitleContaining(pageable,name);
    }


}
