package br.alura.screenmatch.exception;

public class APIKeyError extends RuntimeException{
    private final String message;

    public APIKeyError() {
        this.message = "API key is missing. You can get a new API key on https://www.omdbapi.com/";
    }
    @Override
    public String getMessage() {
        return this.message;
    }
}
