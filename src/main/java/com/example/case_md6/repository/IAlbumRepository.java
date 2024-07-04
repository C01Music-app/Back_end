package com.example.case_md6.repository;

import com.example.case_md6.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface IAlbumRepository extends JpaRepository<Album,Integer> {

}
