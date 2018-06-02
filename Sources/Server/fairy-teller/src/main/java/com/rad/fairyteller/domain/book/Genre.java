package com.rad.fairyteller.domain.book;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="genre")
@Getter
@Setter
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
