package com.rad.fairyteller.domain.purchase;

import com.rad.fairyteller.domain.user.User;
import com.rad.fairyteller.domain.work.Work;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "purchase")
@Data
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "purchase_id")
    private Long id;

    @Column(name = "price")
    private int price;

    @Column(name="date")
    private String date;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "work_id")
    private Work work;
}
