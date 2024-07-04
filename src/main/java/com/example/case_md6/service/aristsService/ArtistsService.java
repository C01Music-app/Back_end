package com.example.case_md6.service.aristsService;

import com.example.case_md6.model.Artists;
import com.example.case_md6.repository.artistsRepository.IArtistsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArtistsService implements IArtistsService {

    @Autowired
    private IArtistsRepository artistsRepository;

    @Override
    public Artists saveArtist(Artists artist) {
        return artistsRepository.save(artist);
    }

    @Override
    public List<Artists> getAllArtists() {
        return artistsRepository.findAll();
    }



    @Override
    public Artists getArtistById(Integer id) {
        return artistsRepository.findById(id).get();
    }



    @Override
    public void deleteArtist(Integer id) {
        artistsRepository.deleteById(id);
    }

    @Override
    public Page<Artists> findArtistsByName(Pageable pageable, String name) {
        return artistsRepository.findbyNamePage(pageable,"%"+name+"%");
    }


}
