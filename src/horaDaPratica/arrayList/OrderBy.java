package horaDaPratica.arrayList;

import java.util.*;

class Title implements Comparable<Title>{
    private String title;
    private int releaseYear;
    private String genre;

    public Title(String title, int releaseYear, String genre) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public int compareTo(Title o) {
        return this.title.compareTo(o.title);
    }
    @Override
    public String toString() {
        return "[ "+ title + " / " + genre+ " ]";
    }
}

public class OrderBy {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(9);
        numbers.add(2);
        numbers.add(7);
        numbers.add(1);

        Collections.sort(numbers);
        System.out.println(numbers);
        List<Integer> reverse = new ArrayList<>(numbers);
        Collections.reverse(reverse);
        System.out.println(reverse);


//        Title t1 = new Title("Anora");
//        Title t2 = new Title("The Brutalist");
//        Title t3 = new Title("A Complete Unknown");
//        Title t4 = new Title("Conclave");
//        Title t5 = new Title("Dune: Part two");
//        Title t6 = new Title("I'm Still Here");
//        Title t7 = new Title("Nickel Boys");
//        Title t8 = new Title("Emilia Pérez");
//        Title t9 = new Title("The Substance");
//        Title t10 = new Title("Wicked");

        //List<Title> oscar25 = new ArrayList<Title>();
        
        List<Title> oscar25 = new LinkedList<Title>();
        oscar25.add(new Title("Anora", 2024, "Drama, Comedy"));
        oscar25.add(new Title("The Brutalist", 2024, "Drama"));
        oscar25.add(new Title("A Complete Unknown", 2024, "Drama, Musical, Biography"));
        oscar25.add(new Title("Conclave", 2024, "Suspense"));
        oscar25.add(new Title("Dune: Part two", 2024, "Drama, Science Fiction"));
        oscar25.add(new Title("I'm Still Here", 2024, "Drama, Suspense"));
        oscar25.add(new Title("Nickel Boys", 2024, "Drama"));
        oscar25.add(new Title("Emilia Pérez", 2024, "Drama, Musical Comedy, Suspense"));
        oscar25.add(new Title("The Substance", 2024, "Terror"));
        oscar25.add(new Title("Wicked", 2024, "Fantasy"));

        Collections.sort(oscar25);
        System.out.println(oscar25);
        oscar25.sort(Comparator.comparing(Title::getGenre));
        System.out.println(oscar25);


    }
}
