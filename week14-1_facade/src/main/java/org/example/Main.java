package org.example;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ApiFacade apiFacade = new ApiFacadeImpl();

        try {
            String jokeUrl = "https://api.chucknorris.io/jokes/random";
            String joke = apiFacade.getAttributeValueFromJson(jokeUrl, "value");
            System.out.println("- Chuck Norris Joke: " + joke);

            String ratesUrl = "https://api.fxratesapi.com/latest";
            String rate = apiFacade.getAttributeValueFromJson(ratesUrl, "base");
            System.out.println("- Base currency rate: " + rate);
        } catch (IOException e) {
            System.err.println("Error making HTTP request: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Error parsing JSON: " + e.getMessage());
        }
    }
}
