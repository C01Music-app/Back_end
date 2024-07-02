package com.example.case_md6.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Playlists {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Danh Sách Phát
    private Integer id;
    private String title;
//id ng dùng
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
    //id bài hát
    @ManyToOne
    @JoinColumn(name = "songs_id", referencedColumnName = "id")
    private Songs songs;

}
