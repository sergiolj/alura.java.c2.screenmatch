package br.alura.screenmatch.calcs;

public class FilterTrends {

    public void trends(Rateable rateable) {
        if (rateable.getRate() >= 4) {
            System.out.println("In the most-watched and top-rated films at the moment.");
        }else if (rateable.getRate() >= 2) {
            System.out.println("In the list of the well-rated movies.");
        }else{
            System.out.println("It isn't so well-rated but you can like it based on your viewed list.");
            }
    }
}
