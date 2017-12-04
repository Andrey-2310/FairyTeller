package com.rad.fairyteller.domain.genre;

import com.rad.fairyteller.domain.work.Work;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="genre")
@Data
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "genre_id")
    private Long id;

    @Column(name = "genre_name")
    @Enumerated(EnumType.STRING)
    private GenreType genreType;

    @ManyToMany(mappedBy = "genres")
    private List<Work> works;
}
