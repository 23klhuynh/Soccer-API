package com.soccerstats.soccer_stats.Player;

import jakarta.persistence.*;

@Entity
@Table(name="player_statistic")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "player_name", unique = true, nullable = false)
    private String name;

    @Column(name = "nation")
    private String nation;

    @Column(name = "position")
    private String position;

    @Column(name = "age")
    private Integer age;

    @Column(name = "matches_played")
    private Integer matchesPlayed;

    @Column(name = "starts")
    private Integer starts;

    @Column(name = "minutes_played")
    private Integer minutesPlayed;

    @Column(name = "goals")
    private Integer goals;

    @Column(name = "assists")
    private Integer assists;

    @Column(name = "penalties_scored")
    private Integer penaltiesScored;

    @Column(name = "yellow_cards")
    private Integer yellowCards;

    @Column(name = "red_cards")
    private Integer redCards;

    @Column(name = "expected_goals")
    private Double expectedGoals;

    @Column(name = "expected_assists")
    private Double expectedAssists;

    @Column(name = "team_name")
    private String teamName;

    @Column(name = "competition")
    private String competition;


    public Player(){
    }

    public Player(String name, String nation, String position, Integer age,
                  Integer matchesPlayed, Integer starts, Integer minutesPlayed,
                  Integer goals, Integer assists, Integer penaltiesScored,
                  Integer yellowCards, Integer redCards, Double expectedGoals,
                  Double expectedAssists, String teamName, String competition) {
        this.name = name;
        this.nation = nation;
        this.position = position;
        this.age = age;
        this.matchesPlayed = matchesPlayed;
        this.starts = starts;
        this.minutesPlayed = minutesPlayed;
        this.goals = goals;
        this.assists = assists;
        this.penaltiesScored = penaltiesScored;
        this.yellowCards = yellowCards;
        this.redCards = redCards;
        this.expectedGoals = expectedGoals;
        this.expectedAssists = expectedAssists;
        this.teamName = teamName;
        this.competition = competition;
    }

    public Player(String name){
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(Integer matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public Integer getStarts() {
        return starts;
    }

    public void setStarts(Integer starts) {
        this.starts = starts;
    }

    public Integer getMinutesPlayed() {
        return minutesPlayed;
    }

    public void setMinutesPlayed(Integer minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
    }

    public Integer getGoals() {
        return goals;
    }

    public void setGoals(Integer goals) {
        this.goals = goals;
    }

    public Integer getAssists() {
        return assists;
    }

    public void setAssists(Integer assists) {
        this.assists = assists;
    }

    public Integer getPenaltiesScored() {
        return penaltiesScored;
    }

    public void setPenaltiesScored(Integer penaltiesScored) {
        this.penaltiesScored = penaltiesScored;
    }

    public Integer getYellowCards() {
        return yellowCards;
    }

    public void setYellowCards(Integer yellowCards) {
        this.yellowCards = yellowCards;
    }

    public Integer getRedCards() {
        return redCards;
    }

    public void setRedCards(Integer redCards) {
        this.redCards = redCards;
    }

    public Double getExpectedGoals() {
        return expectedGoals;
    }

    public void setExpectedGoals(Double expectedGoals) {
        this.expectedGoals = expectedGoals;
    }

    public Double getExpectedAssists() {
        return expectedAssists;
    }

    public void setExpectedAssists(Double expectedAssists) {
        this.expectedAssists = expectedAssists;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getCompetition() {
        return competition;
    }

    public void setCompetition(String competition) {
        this.competition = competition;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nation='" + nation + '\'' +
                ", position='" + position + '\'' +
                ", age=" + age +
                ", matchesPlayed=" + matchesPlayed +
                ", starts=" + starts +
                ", minutesPlayed=" + minutesPlayed +
                ", goals=" + goals +
                ", assists=" + assists +
                ", penaltiesScored=" + penaltiesScored +
                ", yellowCards=" + yellowCards +
                ", redCards=" + redCards +
                ", expectedGoals=" + expectedGoals +
                ", expectedAssists=" + expectedAssists +
                ", teamName='" + teamName + '\'' +
                ", competition='" + competition + '\'' +
                '}';
    }
}
