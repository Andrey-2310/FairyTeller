package com.rad.fairyteller.domain.book;

import com.rad.fairyteller.domain.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "author")
@Getter
@Setter
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "author_id")
    Long id;

    @OneToOne(fetch=FetchType.LAZY, mappedBy="author")
    private User user;

    @OneToMany(mappedBy = "author")
    private List<Work> works;

}
