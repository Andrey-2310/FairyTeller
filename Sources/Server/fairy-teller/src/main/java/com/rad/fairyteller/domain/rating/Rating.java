package com.rad.fairyteller.domain.rating;

import com.rad.fairyteller.domain.user.User;
import com.rad.fairyteller.domain.work.Work;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "rating")
@Data
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "rating_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "work_id")
    private Work work;

    @Column(name = "rating_value")
    private int value;
}
