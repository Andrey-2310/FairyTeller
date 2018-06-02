package com.rad.fairyteller.domain.book;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "chapter")
@Getter
@Setter
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "chapter_id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "innerId")
    private Long innerId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "work_id")
    private Work work;

    @OneToMany(mappedBy = "chapter", cascade = CascadeType.ALL)
    private List<Unit> units;
}
