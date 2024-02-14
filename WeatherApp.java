package oppps;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class WeatherApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter city name: ");
        String cityName = scanner.nextLine();

        try {
            String apiKey = "YOUR_OPENWEATHERMAP_API_KEY";
            String apiUrl = "http://api.openweathermap.org/data/2.5/weather?q=" + cityName + "&appid=" + apiKey;

            // Make an API request to OpenWeatherMap
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = connection.getInputStream();

            // Read the response
            Scanner responseScanner = new Scanner(inputStream);
            StringBuilder response = new StringBuilder();
            while (responseScanner.hasNext()) {
                response.append(responseScanner.next());
            }
            responseScanner.close();

            // Parse and display weather information
            parseAndDisplayWeather(response.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void parseAndDisplayWeather(String response) {
        // Parse JSON response (a proper JSON parsing library would be better in a real-world app)
        String temperature = response.split("\"temp\":")[1].split(",")[0];
        String description = response.split("\"description\":\"")[1].split("\"")[0];

        // Display weather information
        System.out.println("\nWeather Information:");
        System.out.println("Temperature: " + temperature + " K");
        System.out.println("Description: " + description);
    }
}
