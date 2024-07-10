package com.example.case_md6.repository.artistsRepository;

import com.example.case_md6.model.Artists;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IArtistsRepository extends JpaRepository<Artists, Integer> {

//    @Query(value = " select * from artists where name like :name",
//            nativeQuery = true)
//    Page<Artists> findbyNamePage(Pageable pageable, @Param("name") String name);

    List<Artists> findByNameContainingIgnoreCase(String name);
}
