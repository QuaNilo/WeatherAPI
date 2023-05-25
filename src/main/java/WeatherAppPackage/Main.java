package WeatherAppPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JLabel;

public class Main {

	public static WeatherAPIClient location_ID = new WeatherAPIClient("275499");
	public static MyPanel resultPanel = null;
	
	public static void main(String[] args) throws IOException {			
			//CREATED PANELS
		CurrentWeather currentWeather = location_ID.getCurrentConditions();
		if(currentWeather == null) {
            System.out.println("Failed to retrieve Current Weather data.");
		}
		else {
			menu(currentWeather);
		}

	        

	}
	
	public static void menu(CurrentWeather currentWeather) {
        //CREATED PANELS
    	MyPanel topPanel = new MyPanel(0,0,600,50);
        topPanel.setBorder(true);
        for(final MyButton button: MyButton.getButtonList()) {
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
					// Update location_ID based on the clicked button
                    if (button.getText().equals("Entroncamento")) {
                    	location_ID.setLocationKey("275499");
                    } else if (button.getText().equals("Lisboa")) {
                    	location_ID.setLocationKey("275485");
                    } else if (button.getText().equals("Toquio")) {
                     	location_ID.setLocationKey("226396");
                    } else if (button.getText().equals("Tomar")) {
                     	location_ID.setLocationKey("275485");
                    } else if (button.getText().equals("Faro")) {
                     	location_ID.setLocationKey("273190");
                    } else if (button.getText().equals("Toronto")) {
                     	location_ID.setLocationKey("55488");
                    } else if (button.getText().equals("Rio De Janeiro")) {
                     	location_ID.setLocationKey("45449");
                    } else if (button.getText().equals("Almada")) {
                     	location_ID.setLocationKey("275589");
                    }
                	else if (button.getText().equals("Kyoto")) {
                		location_ID.setLocationKey("226396");
                	}
                    else {
                    	System.out.println("Someone fucked up");
                    }
                    updateWeatherInfo();
                }
            });
        	topPanel.add(button);
        }
        
        MyPanel midPanel = new MyPanel(0,50,300,450);
        midPanel.setBorder(true);
        MenuLabel[] labels = {
        		new MenuLabel("Temperature"),
                new MenuLabel("Location"),
                new MenuLabel("Link"),
                new MenuLabel("Time"),
        };
        for (MenuLabel label : labels) {
            midPanel.add(label);
        }
        
        
        if (currentWeather != null) {
            Double num = currentWeather.getTemperature().getMetric().getValue();
            String strTemp = num.toString();

            resultPanel = new MyPanel(300, 50, 300, 450);
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
        }else {
        	System.out.println("Failed to print API variables");
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
	
	private static void updateWeatherInfo() {
	    // Clear previous weather information
	    resultPanel.removeAll();

	    try {
	        CurrentWeather currentWeather = location_ID.getCurrentConditions();

	        if (currentWeather != null) {
	            Double num = currentWeather.getTemperature().getMetric().getValue();
	            String strTemp = num.toString();

	            MenuLabel[] resultlabels = {
	                    new MenuLabel(strTemp),
	                    new MenuLabel(currentWeather.getWeatherText()),
	                    new MenuLabel(currentWeather.getLink()),
	                    new MenuLabel(currentWeather.getLocalObservationDateTime()),
	            };
	            for (MenuLabel label : resultlabels) {
	                resultPanel.add(label);
	            }
	        } else {
	            System.out.println("Failed to retrieve current weather conditions.");
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }

	    // Refresh the panel to update the changes
	    resultPanel.revalidate();
	    resultPanel.repaint();
	}

}

		
	
