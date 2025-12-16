import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherForecaster {
    public static void main(String[] args) {
        String apiKey = "9db1d898068268d2b5d9499fd164720a";
        String location = "London"; // Change this to user input if needed
        String response = getWeather(apiKey, location);
        displayWeather(response);
    }

    private static String getWeather(String apiKey, String location) {
        String urlString = "http://api.openweathermap.org/data/2.5/weather?q=" + location + "&appid=" + apiKey + "&units=metric";
        try {
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            return response.toString();
        } catch (Exception e) {
            System.out.println("Error fetching weather data: " + e.getMessage());
            return null;
        }
    }

    private static void displayWeather(String data) {
        if (data != null) {
            System.out.println("Weather data: " + data); // You can parse JSON here to extract specific fields
        } else {
            System.out.println("Could not retrieve weather data.");
        }
    }
}