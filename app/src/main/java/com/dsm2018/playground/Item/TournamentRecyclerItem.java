package com.dsm2018.playground.Item;

public class TournamentRecyclerItem {
    int sportsT;
    private String tournamentTitle;
    private String howLong;
    private String place;
    private String people;

    public TournamentRecyclerItem(int sportsT, String tournametTitle, String howLong, String place, String people) {
        this.sportsT = sportsT;
        this.tournamentTitle = tournametTitle;
        this.howLong = howLong;
        this.place = place;
        this.people = people;
    }

    public int getSportsT() {
        return sportsT;
    }

    public String getTournamentTitle() {
        return tournamentTitle;
    }

    public String getHowLong() {
        return howLong;
    }

    public String getPlace() {
        return place;
    }

    public String getPeople() {
        return people;
    }
}
