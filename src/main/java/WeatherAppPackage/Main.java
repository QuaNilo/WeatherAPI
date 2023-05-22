package WeatherAppPackage;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println("So lindu");
		WeatherAPIClient entroncamento = new WeatherAPIClient("275499");
		System.out.println("Me deus");
		CurrentWeather currentWeather = entroncamento.getCurrentConditions();
		
		if (currentWeather != null) {
            System.out.println("Weather Text: " + currentWeather.getWeatherText());
            System.out.println("Temperature: " + currentWeather.getTemperature().getMetric().getValue() + " " +
                    currentWeather.getTemperature().getMetric().getUnit());
            System.out.println("Link: " + currentWeather.getLink());
            // Access other fields as needed
        } else {
            System.out.println("Failed to retrieve Current Weather data.");
        }
    }
		
	}
