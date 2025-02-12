package br.alura.screenmatch.models;

public record Book (String title, String authors, String description) {

    @Override
    public String toString() {
        return """
                Book %s
                Authors %s
                Description %s
                """.formatted(title, authors, description);
    }
}
