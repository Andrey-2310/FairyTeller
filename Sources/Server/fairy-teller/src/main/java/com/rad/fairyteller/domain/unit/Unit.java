package com.rad.fairyteller.domain.unit;

import com.rad.fairyteller.domain.chapter.Chapter;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "unit")
@Data
public class Unit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "content_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "chapter_id")
    private Chapter chapter;

    @Column(name = "content")
    private String content;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private ContentType type;
}
