package com.example.case_md6.service.aristsService;

import com.example.case_md6.model.Artists;
import java.util.List;

public interface IArtistsService {
    Artists saveArtist(Artists artist);

    List<Artists> getAllArtists();



    Artists getArtistById(Integer id);

    
    void deleteArtist(Integer id);


    List<Artists> findArtistsByName(String name);

}
