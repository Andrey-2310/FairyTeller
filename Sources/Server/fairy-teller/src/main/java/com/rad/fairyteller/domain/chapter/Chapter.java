package com.rad.fairyteller.domain.chapter;

import com.rad.fairyteller.domain.work.Work;
import com.rad.fairyteller.domain.unit.Unit;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "chapter")
@Data
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "chapter_id")
    private Long id;

    @Column(name = "title")
    private String title;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "work_id")
    private Work work;


    @OneToMany(mappedBy = "chapter", cascade = CascadeType.ALL)
    private List<Unit> units;
}
