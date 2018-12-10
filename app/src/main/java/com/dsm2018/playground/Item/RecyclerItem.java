package com.dsm2018.playground.Item;

public class RecyclerItem {
    private int sports;
    private String name;
    private String title;
    private String time;
    private String place;
    private String people;


    public RecyclerItem (int sports, String name, String title, String time, String place, String people){
        this.sports = sports;
        this.name = name;
        this.title = title;
        this.time = time;
        this.place = place;
        this.people = people;
    }

    public int getSports(){
        return sports;
    }

    public String getName(){
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getTime(){
        return time;
    }

    public String getPlace(){
        return place;
    }

    public String getPeople(){
        return people;
    }
}
