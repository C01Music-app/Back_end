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
    private LocalDate dateStart;

    @ManyToOne
    @JoinColumn(name = "songs_id", referencedColumnName = "id")
    private Songs songs;

    @Column(columnDefinition = "text")
    private String impAlbum;

}
