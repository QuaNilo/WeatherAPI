package WeatherAppPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.fasterxml.jackson.databind.ObjectMapper;
 

public class WeatherAPIClient {
	
	private  final String API_KEY = "JAPa5Y8MFzO4M3mGsli4eckspSySNKNH";
	private  final String currentConditionsEndPoint = "http://dataservice.accuweather.com/currentconditions/v1/{LOCATION_KEY}?apikey=" + API_KEY;
	private  final String locationKey;
	
	WeatherAPIClient(String locationKey){
		this.locationKey = locationKey;
	}
	
	public CurrentWeather getCurrentConditions() throws IOException {
		CurrentWeather weatherdata = null;
		try {
			URL url = new URL(currentConditionsEndPoint.replace("{LOCATION_KEY}", locationKey));
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			
			int responseCode = connection.getResponseCode();
			if(responseCode == HttpURLConnection.HTTP_OK) {
				BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
				String line;
				StringBuilder response = new StringBuilder();
				while((line = reader.readLine()) != null) {
					response.append(line);
				}
				reader.close();
				ObjectMapper objectMapper = new ObjectMapper();
	            CurrentWeather[] weatherDataArray = objectMapper.readValue(response.toString(), CurrentWeather[].class);
	            if (weatherDataArray != null && weatherDataArray.length > 0) {
	                weatherdata = weatherDataArray[0];
	            }
			}else {
				System.out.println("Oops");
			}
			}
			catch(IOException e){
				e.printStackTrace();
			}
		return weatherdata;
		}

	public Forecast1DayWeather getForecast1day() {
		return null;
	}
	
	}




	
		
		
