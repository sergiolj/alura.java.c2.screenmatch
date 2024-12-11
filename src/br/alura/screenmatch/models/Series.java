package br.alura.screenmatch.models;

public class Series extends Title{
    private int seasons;
    private int episodes;
    boolean inProduction;
    private int episodeDuration;

    public int getSeasons() {
        return seasons;
    }

    public void setEpisodeDuration(int episodeDuration) {
        this.episodeDuration = episodeDuration;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public boolean isInProduction() {
        return inProduction;
    }

    public void setInProduction(boolean inProduction) {
        this.inProduction = inProduction;
    }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public int getDuration() {
        return (this.seasons * this.episodes * this.episodeDuration);
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
