package com.example.case_md6.service.aristsService;

import com.example.case_md6.model.Artists;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IArtistsService {
    Artists saveArtist(Artists artist);

    List<Artists> getAllArtists();



    Artists getArtistById(Integer id);

    
    void deleteArtist(Integer id);


    Page<Artists> findArtistsByName(Pageable pageable, String name);

}
