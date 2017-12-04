package com.rad.fairyteller.domain.work;

import com.rad.fairyteller.domain.author.Author;
import com.rad.fairyteller.domain.chapter.Chapter;
import com.rad.fairyteller.domain.genre.Genre;
import com.rad.fairyteller.domain.language.Language;
import com.rad.fairyteller.domain.purchase.Purchase;
import com.rad.fairyteller.domain.user.User;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "work")
@Data
public class Work {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "work_id")
    private Long id;

    @Column(name = "views")
    private int views;

    @Column(name = "rating")
    private Integer rating;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "coverImage")
    private String coverImagePath;

    @Column(name = "year")
    private Integer year;

    @Column(name="pagesAmount")
    private int pagesAmount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="language_id")
    private Language language;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id")
    private Author author;

    @OneToMany(mappedBy = "work", cascade = CascadeType.ALL)
    private List<Chapter> chapters;

    @OneToMany(mappedBy = "work", cascade = CascadeType.ALL)
    private List<Purchase> purchases;

    @ManyToMany(mappedBy = "favouriteWorks")
    private List<User> likedUsers;

    @ManyToMany
    @JoinTable(name = "work_genre", joinColumns = @JoinColumn(name = "work_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id"))
    private List<Genre> genres;
}
