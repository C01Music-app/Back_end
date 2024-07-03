package com.example.case_md6.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String artists;
    private String category;
    private Date dateStart;
    //    @ManyToOne
//    @JoinColumn(name = "songs_id", referencedColumnName = "id")
//    private Songs songs;
    @OneToMany(mappedBy = "album")
    private Set<Songs> songs;

    private String impAlbum;

}
