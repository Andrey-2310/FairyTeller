package com.rad.fairyteller.domain.book;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "language")
@Getter
@Setter
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "language_id")
    private Long id;

    @Column(name = "language_type")
    @Enumerated(EnumType.STRING)
    private LanguageType languageType;

    @OneToMany(mappedBy = "language")
    private List<Work> works;
}
