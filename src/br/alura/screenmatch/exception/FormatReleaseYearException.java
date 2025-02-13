package br.alura.screenmatch.exception;

public class FormatReleaseYearException extends RuntimeException {
    private final String message;

    public FormatReleaseYearException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
