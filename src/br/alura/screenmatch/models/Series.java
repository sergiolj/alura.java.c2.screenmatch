package br.alura.screenmatch.models;

public class Series extends Title {
    private int seasons;
    private int episodesPerSeason;
    boolean inProduction;
    private int averageEpisodesDuration;

    public int getAverageEpisodesDuration() {
        return averageEpisodesDuration;
    }

    public void setAverageEpisodesDuration(int averageEpisodesDuration) {
        this.averageEpisodesDuration = averageEpisodesDuration;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public boolean isInProduction() {
        return inProduction;
    }

    public void setInProduction(boolean inProduction) {
        this.inProduction = inProduction;
    }

    @Override
//    public String toString() {
//      this.technicalSheet = """
//                Series: %s
//                Seasons: %s
//                Episodes: %d
//                Rating: %d
//                """.formatted(this.getTitle(), this.getSeasons(),this.getEpisodesPerSeason(), this.getRate());
//            return technicalSheet;
//    }
    public String toString(){
        return "[" + this.getTitle() + " (" + this.getReleaseYear()+") ]";
    }

    @Override
    public int getDuration() {
        return (this.seasons * this.episodesPerSeason * this.averageEpisodesDuration);
    }
    @Override
    /**
     * Como fica a questão de sobrescrever o método setDuration (int duration), esse método não faz sentido ser
     * implementado passando parâmetros no caso de series, pois a duração da série é uma multiplicação da duração de um
     * episódio pelo número de episódios e temporadas.
     */
    public void setDuration(int duration) {
        throw new UnsupportedOperationException("Not supported for this subclass.\n" +
                "Use setEpisodeDuration() instead.");
    }
}
