package com.example.case_md6.service;

import com.example.case_md6.model.Songs;
import com.example.case_md6.repository.ISongsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongsService implements ISongsService {
    @Autowired
    private ISongsRepository iSongsRepository;


    @Override
    public Page<Songs> getAllPage(Pageable pageable, String name) {
        return iSongsRepository.getAllPage(pageable,"%"+name+"%");
    }

    @Override
    public void save(Songs songs) {
        iSongsRepository.save(songs);
    }

    @Override
    public Songs findById(Integer id) {
        return iSongsRepository.findById(id).get();
    }

    @Override
    public void removeSongs(Songs songs) {
        iSongsRepository.delete(songs);
    }
}
