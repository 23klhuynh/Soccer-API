package com.soccerstats.soccer_stats.Player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="player_statistic")
public class Player {
    @Id
    @Column(name = "name")
    private String name;

    private String nation;

    private String pos;

    private String age;

    private Integer mp;

    private Integer starts;

    private String min;

    private Double gls;

    private Double ast;

    private Double pk;

    private Double crdy;

    private Double crdr;

    private Double xg;

    private Double xag;

    @Id
    @Column(name = "team")
    private String team;

    private String comp;


}
