package com.rad.fairyteller.domain.book;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
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
