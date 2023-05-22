package WeatherAppPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) throws IOException {			
			//CREATED PANELS
		WeatherAPIClient location_ID = new WeatherAPIClient("275499");
		CurrentWeather currentWeather = location_ID.getCurrentConditions();
		if(currentWeather == null) {
            System.out.println("Failed to retrieve Current Weather data.");
		}
		else {
			Menu.menu(currentWeather);
		}

	        

	}
}
		
	
