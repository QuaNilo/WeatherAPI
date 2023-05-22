package WeatherAppPackage;
import FrameWeatherAPP.*;

import java.io.IOException;
import javax.swing.JLabel;

import FrameWeatherAPP.MenuLabel;
import FrameWeatherAPP.MyButton;
import FrameWeatherAPP.MyFrame;
import FrameWeatherAPP.MyPanel;

public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println("So lindu");
		WeatherAPIClient entroncamento = new WeatherAPIClient("275499");
		System.out.println("Me deus");
		CurrentWeather currentWeather = entroncamento.getCurrentConditions();
		
		
		
		String strTemp = "";
		if (currentWeather != null) {
			Double temperature = currentWeather.getTemperature().getMetric().getValue();
			strTemp = temperature.toString();
			
			
            System.out.println("Weather Text: " + currentWeather.getWeatherText());
            System.out.println("Temperature: " + currentWeather.getTemperature().getMetric().getValue() + " " +
                    							currentWeather.getTemperature().getMetric().getUnit());
            System.out.println("Link: " + currentWeather.getLink());
            // Access other fields as needed
        } else {
            System.out.println("Failed to retrieve Current Weather data.");
        }
		
		//CREATED PANELS
        MyPanel topPanel = new MyPanel(0,0,600,50);
        topPanel.setBorder(true);
        for(MyButton button: MyButton.getButtonList()) {
        	topPanel.add(button);
        }
        
        MyPanel midPanel = new MyPanel(0,50,300,450);
        midPanel.setBorder(true);
        MenuLabel[] labels = {
        		new MenuLabel("Temperature"),
                new MenuLabel("Type"),
                new MenuLabel("Link"),
                new MenuLabel("Time"),
        };
        for (MenuLabel label : labels) {
            midPanel.add(label);
        }
        
        
        
        
        MyPanel resultPanel = new MyPanel(300,50,300,450);
        resultPanel.setBorder(true);
        MenuLabel[] resultlabels = {
        		new MenuLabel(strTemp),
                new MenuLabel(currentWeather.getWeatherText()),
                new MenuLabel(currentWeather.getLink()),
                new MenuLabel(currentWeather.getLocalObservationDateTime()),
        };
        for (MenuLabel label : resultlabels) {
        	resultPanel.add(label);
        }
        
        
        
        MyPanel bottomPanel = new MyPanel(0,535,600,30);
        JLabel author = new JLabel("MADE BY JOÃO VELEZ");
        bottomPanel.add(author);
        
 
        
        //FRAME
        MyFrame frame = new MyFrame();
        frame.add(topPanel);
        frame.add(bottomPanel);
        frame.add(resultPanel);
        frame.add(midPanel);
        // Refresh the frame to update the changes
        frame.revalidate();
        frame.repaint();
    }
}
		
