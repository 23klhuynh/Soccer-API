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

    //@Id
    //@Column(name = "team")
    private String team;

    private String comp;

    public Player(){
    }

    public Player(String name, String nation, String pos, String age,
                  int mp, int starts, String min, double gls,
                  double ast, double pk, double crdy, double crdr,
                  double xg, double xag, String team, String comp){
        this.name = name;
        this.nation = nation;
        this.pos = pos;
        this.age = age;
        this.mp = mp;
        this.starts = starts;
        this.min = min;
        this.gls = gls;
        this.ast = ast;
        this.pk = pk;
        this.crdy = crdy;
        this.crdr = crdr;
        this.xg = xg;
        this.xag = xag;
        this.team = team;
        this.comp = comp;
    }

    public Player(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getNation(){
        return nation;
    }

    public void setNation(String nation){
        this.nation = nation;
    }

    public String getPos(){
        return pos;
    }

    public void setPos(String pos){
        this.pos = pos;
    }

    public String getAge(){
        return age;
    }

    public void setAge(String age){
        this.age = age;
    }

    public int getMp(){
        return mp;
    }

    public void setMp(int mp){
        this.mp = mp;
    }

    public int getStarts(){
        return starts;
    }

    public void setStarts(int starts) {
        this.starts = starts;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min){
        this.min = min;
    }

    public double getGls(){
        return gls;
    }

    public void setGls(double gls){
        this.gls = gls;
    }

    public double getAst(){
        return ast;
    }

    public void setAst(double ast){
        this.ast = ast;
    }

    public double getPk() {
        return pk;
    }

    public void setPk(double pk) {
        this.pk = pk;
    }

    public double getCrdy() {
        return crdy;
    }

    public void setCrdy(double crdy) {
        this.crdy = crdy;
    }

    public double getCrdr() {
        return crdr;
    }

    public void setCrdr(double crdr) {
        this.crdr = crdr;
    }

    public double getXg() {
        return xg;
    }

    public void setXg(double xg) {
        this.xg = xg;
    }

    public double getXag() {
        return xag;
    }

    public void setXag(double xag) {
        this.xag = xag;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getComp(){
        return comp;
    }

    public void setComp(String comp){
        this.comp = comp;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", nation='" + nation + '\'' +
                ", pos='" + pos + '\'' +
                ", age=" + age +
                ", mp=" + mp +
                ", starts=" + starts +
                ", min=" + min +
                ", gls=" + gls +
                ", ast=" + ast +
                ", pk=" + pk +
                ", crdy=" + crdy +
                ", crdr=" + crdr +
                ", xg=" + xg +
                ", xag=" + xag +
                ", team='" + team + '\'' +
                ", comp='" + comp + '\'' +
                '}';
    }


}
