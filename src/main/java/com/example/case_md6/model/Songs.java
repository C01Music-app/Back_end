package com.example.case_md6.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Songs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //bài hát

    private Integer id;
    private String title;
    private String artist;
//    @ManyToOne
//    @JoinColumn(name = "album_id", referencedColumnName = "id")
//    private Album album;

    private String category;
    private String time;
    private Date dateStart;
    @Column(columnDefinition = "text")
    private String lyrics;
    private Integer listens;
    private Integer likes;

}
