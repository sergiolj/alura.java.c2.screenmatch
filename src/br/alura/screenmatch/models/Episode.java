package br.alura.screenmatch.models;

import br.alura.screenmatch.calcs.Rateable;

public class Episode extends Series {
    private int number;
    private String title;
    private Series series;
    private int season;
    private int episodeDuration;
    private int watchedCounter=0;

    public int getWatchedCounter() {
        return watchedCounter;
    }

    public void setWatchedCounter(int watchedCounter) {
        this.watchedCounter = watchedCounter;
    }

    public int getEpisodeDuration() {
        return episodeDuration;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public void setEpisodeDuration(int episodeDuration) {
        this.episodeDuration = episodeDuration;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    @Override
    public int getRate(){
        if (watchedCounter >100){
            return 4;
        }else{
            return 2;
        }
    }

    @Override
    public String toString() {
        this.technicalSheet = """
                Series: %s
                Episode Title: %s
                Season: %d
                Episode: %d
                Ratting Stars: %d
                """.formatted(this.series.getTitle(), this.getTitle(), this.getSeason(), this.getNumber(), this.getRate());
        return technicalSheet;
    }
}
