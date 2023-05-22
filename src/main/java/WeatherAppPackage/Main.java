package WeatherAppPackage;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println("So lindu");
		WeatherAPIClient entroncamento = new WeatherAPIClient("275499");
		System.out.println("Me deus");
		WeatherData weatherdata = entroncamento.getAPI();
		
		if (weatherdata != null) {
            System.out.println("Weather Text: " + weatherdata.getWeatherText());
            System.out.println("Temperature: " + weatherdata.getTemperature().getMetric().getValue() + " " +
                    weatherdata.getTemperature().getMetric().getUnit());
            System.out.println("Link: " + weatherdata.getLink());
            // Access other fields as needed
        } else {
            System.out.println("Failed to retrieve weather data.");
        }
    }
		
	}
