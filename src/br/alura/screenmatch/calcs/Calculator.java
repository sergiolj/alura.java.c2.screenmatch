package br.alura.screenmatch.calcs;
import br.alura.screenmatch.models.Title;

public class Calculator {
    private int marathonMinutes;

    public int getMarathonHours() {
        return marathonMinutes/60;
    }

    public void addTitleDuration(Title title) {
        marathonMinutes += title.getDuration();
    }
}
