package com.example.case_md6.repository;

import com.example.case_md6.model.Album;
import com.example.case_md6.model.Artists;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface IAlbumRepository extends JpaRepository<Album,Integer> {

    Page<Album> findAllByTitleContaining(Pageable pageable, String name);

}
