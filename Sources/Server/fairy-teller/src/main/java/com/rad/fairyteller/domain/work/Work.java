package com.rad.fairyteller.domain.work;

import com.rad.fairyteller.domain.author.Author;
import com.rad.fairyteller.domain.chapter.Chapter;
import com.rad.fairyteller.domain.purchase.Purchase;
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

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "coverImage")
    private String coverImagePath;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id")
    private Author author;

    @OneToMany(mappedBy = "work", cascade = CascadeType.ALL)
    private List<Chapter> chapters;

    @OneToMany(mappedBy = "work", cascade=CascadeType.ALL)
    private List<Purchase> purchases;

}
