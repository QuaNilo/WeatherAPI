package WeatherAppPackage;
import FrameWeatherAPP.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JLabel;

import FrameWeatherAPP.MenuLabel;
import FrameWeatherAPP.MyButton;
import FrameWeatherAPP.MyFrame;
import FrameWeatherAPP.MyPanel;

public class Main {

	public static void main(String[] args) throws IOException {
		final String location_code = "";
		
		//CREATED PANELS
        MyPanel topPanel = new MyPanel(0,0,600,50);
        topPanel.setBorder(true);
        for(final MyButton button: MyButton.getButtonList()) {
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String location_code;
					// Update location_ID based on the clicked button
                    if (button.getText().equals("Entroncamento")) {
                        location_code = "24566";
                    } else if (button.getText().equals("Lisboa")) {
                        location_code = "24566";
                    } else if (button.getText().equals("Kyoto")) {
                        location_code = "24566";
                    } else if (button.getText().equals("Tomar")) {
                        location_code = "24566";
                    } else if (button.getText().equals("Algarve")) {
                        location_code = "24566";
                    } else if (button.getText().equals("Toronto")) {
                        location_code = "24566";
                    } else if (button.getText().equals("Rio De Janeiro")) {
                        location_code = "24566";
                    } else if (button.getText().equals("Almada")) {
                        location_code = "24566";
                    }
                    else {
                    	System.out.println("Someone fucked up");
                    }
                }
            });
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
        
		
		
		WeatherAPIClient location_ID = new WeatherAPIClient(location_code);
		CurrentWeather currentWeather = location_ID.getCurrentConditions();
		
		
		
		String strTemp = "";
		if (currentWeather != null) {

        } else {
            System.out.println("Failed to retrieve Current Weather data.");
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
		
