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
public class Songs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Integer id;
    @Column(columnDefinition = "text")
    private String imgSongs;
    private String title;

    private String artist;


    private String category;
    private String time;

    private LocalDate dateStart;


    @Column(columnDefinition = "text")
    private String lyrics;
    private Integer listens;
    private Integer likes;

}