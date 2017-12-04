package com.rad.fairyteller.domain.language;

import com.rad.fairyteller.domain.work.Work;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "language")
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
