package com.example.case_md6.repository;

import com.example.case_md6.model.Songs;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ISongsRepository extends JpaRepository<Songs, Integer> {

    @Query(value = " select * from songs where username like :name",
            nativeQuery = true)
    Page<Songs> getAllPage(Pageable pageable, @Param("name") String name);

}
