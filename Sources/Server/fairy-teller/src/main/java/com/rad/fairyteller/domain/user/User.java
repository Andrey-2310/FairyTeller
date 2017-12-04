package com.rad.fairyteller.domain.user;

import com.rad.fairyteller.domain.author.Author;
import com.rad.fairyteller.domain.purchase.Purchase;
import com.rad.fairyteller.domain.work.Work;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
@Data
//@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "username")
    private String username;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id")
    private Author author;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Purchase> purchases;

    @ManyToMany
    @JoinTable(name = "favWork_user", joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "work_id"))
    private List<Work> favouriteWorks;
}
