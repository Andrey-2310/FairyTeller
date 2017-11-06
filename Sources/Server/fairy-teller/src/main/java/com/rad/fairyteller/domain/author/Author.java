package com.rad.fairyteller.domain.author;

import com.rad.fairyteller.domain.work.Work;
import com.rad.fairyteller.domain.user.User;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "author")
@Data
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
